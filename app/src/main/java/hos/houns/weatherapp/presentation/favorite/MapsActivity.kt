package hos.houns.weatherapp.presentation.favorite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import hos.houns.weatherapp.R
import hos.houns.weatherapp.presentation.*
import kotlinx.coroutines.flow.collect
import org.koin.android.viewmodel.ext.android.getViewModel

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        viewModel = getViewModel()
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.setOnMarkerClickListener {

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(FavouriteUiModelID, it.id)
            intent.putExtra(FavouriteUiModelTitle, it.title)
            intent.putExtra(FavouriteUiModelLat, it.position.latitude)
            intent.putExtra(FavouriteUiModelLong, it.position.longitude)
            startActivity(intent)

            true
        }
        viewModel.setIntent(MainContract.MainIntent.LoadFavouriteIntent)
        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collect { state ->
                when (state) {
                    is MainContract.MainState.Favourites -> {
                        state.value.collect { favourites ->
                            favourites.forEach { favourite ->
                                val latLong = LatLng(favourite.latitude, favourite.longitude)
                                googleMap.addMarker(
                                    MarkerOptions()
                                        .position(latLong)
                                        .title(favourite.label)
                                )
                                googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLong))
                            }
                        }

                    }
                }
            }
        }
    }
}