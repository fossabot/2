package hos.houns.weatherapp.presentation.favorite

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import hos.houns.weatherapp.R
import hos.houns.weatherapp.databinding.PlaceAutocompleteBinding
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.presentation.*
import kotlinx.coroutines.flow.collect
import org.koin.android.viewmodel.ext.android.getViewModel

class PlaceAutocompleteActivity : AppCompatActivity(R.layout.place_autocomplete) {
    private lateinit var binding: PlaceAutocompleteBinding
    private val AUTOCOMPLETE_REQUEST_CODE = 1
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel()
        binding = PlaceAutocompleteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.locations.setOnClickListener {
            val fields = listOf(Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG)
            val intent = Autocomplete.IntentBuilder(AutocompleteActivityMode.FULLSCREEN, fields)
                .build(this)
            startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE)
        }

        binding.maps.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }

        binding.back.setOnClickListener {
            finish()
        }

        initObservers()

        viewModel.setIntent(MainContract.MainIntent.LoadFavoriteIntent)

    }

    private fun initObservers() {
        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collect { state ->
                when (state) {
                    is MainContract.MainState.Favorites -> {
                        state.value.collect {
                            if (it.isEmpty()) {
                                binding.nofavourite.visibility = View.VISIBLE
                                binding.recyclerview.visibility = View.GONE
                            } else {
                                println(it.size)
                                binding.nofavourite.visibility = View.GONE
                                binding.recyclerview.visibility = View.VISIBLE

                                binding.recyclerview.layoutManager =
                                    LinearLayoutManager(applicationContext)
                                binding.recyclerview.adapter =
                                    FavoritesAdapter(it, onLongClicked = {
                                        showDeletionPopup(it)
                                    }, onClicked = {
                                        val intent = Intent(this@PlaceAutocompleteActivity, MainActivity::class.java)
                                        intent.putExtra(FavouriteUiModelID, it.id)
                                        intent.putExtra(FavouriteUiModelTitle, it.label)
                                        intent.putExtra(FavouriteUiModelLat, it.latitude)
                                        intent.putExtra(FavouriteUiModelLong, it.longitude)
                                        startActivity(intent)
                                    })
                            }

                        }
                    }
                }
            }

        }

    }

    private fun showDeletionPopup(favoriteUiModel: FavoriteUiModel) {
        AlertDialog.Builder(this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT)
            .setMessage(getString(R.string.delete_item))
            .setCancelable(false)
            .setPositiveButton(
                getString(android.R.string.yes)
            ) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.DeleteFavoriteIntent(favoriteUiModel))
            }
            .setNegativeButton(android.R.string.cancel) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.InitialIntent)
            }
            .show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == AUTOCOMPLETE_REQUEST_CODE) {
            when (resultCode) {
                Activity.RESULT_OK -> {
                    data?.let {
                        val place = Autocomplete.getPlaceFromIntent(data)
                        viewModel.setIntent(
                            MainContract.MainIntent.AddFavoriteIntent(
                                place
                            )
                        )
                        Log.i("TAG", "Place: ${place.name}, ${place.latLng}")
                    }
                }
                AutocompleteActivity.RESULT_ERROR -> {
                    // TODO: Handle the error.
                    data?.let {
                        val status = Autocomplete.getStatusFromIntent(data)
                        Log.i("TAG", status.statusMessage)
                    }
                }
                Activity.RESULT_CANCELED -> {
                    // The user canceled the operation.
                }
            }
            return
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


}