package hos.houns.weatherapp.presentation

import android.Manifest
import android.annotation.SuppressLint
import android.app.*
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import hos.houns.weatherapp.databinding.FragmentMainBinding
import kotlinx.coroutines.flow.collect
import org.koin.android.viewmodel.ext.android.getSharedViewModel
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import hos.houns.weatherapp.BuildConfig
import hos.houns.weatherapp.R
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import hos.houns.weatherapp.presentation.favourite.PlaceAutocompleteActivity


class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initObservers()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = getSharedViewModel()

        println(requireActivity().intent.extras)
        if (requireActivity().intent.extras == null) {
            binding.locations.visibility = View.VISIBLE
            binding.back.visibility = View.GONE
        } else {
            binding.locations.visibility = View.GONE
            binding.back.visibility = View.VISIBLE
            binding.back.setOnClickListener {
                activity?.finish()
            }

        }
        binding.locations.setOnClickListener {
            startActivity(Intent(requireActivity(), PlaceAutocompleteActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        requestCurrentLocation()
    }

    private fun initObservers() {
        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collect { state ->
                when (state) {
                    MainContract.MainState.Initial -> {

                    }
                    is MainContract.MainState.Error -> {
                        handleError(state.failure)
                    }
                    MainContract.MainState.Loading -> {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.container.visibility = View.GONE
                    }
                    is MainContract.MainState.Success -> {
                        println("Success:${state.value}")
                        handleSuccess(state.value)
                    }
                }
            }

            viewModel.sideEffect.collect {

                when (it) {

                }
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun handleSuccess(value: WeatherUiModel) {
        val color = value.currentWeatherUIModel.type.getColor()
        //MyApp.appcolor =color
        binding.progressBar.visibility = View.GONE
        binding.container.visibility = View.VISIBLE
        binding.container.setBackgroundColor(color)
        value.currentWeatherUIModel.apply {

            binding.currentTempBig.text = this.temp.toString().withDegree()
            binding.currentWeatherType.text = this.type.name
            binding.currentBigImage.setImageResource(this.type.getImage())
            binding.minTemp.text = this.tempMin.toString().withDegree()
            binding.currentTemp.text = this.temp.toString().withDegree()
            binding.maxTemp.text = this.tempMax.toString().withDegree()
        }

        binding.forecasts.layoutManager = LinearLayoutManager(requireActivity().applicationContext)
        binding.forecasts.adapter =
            ForecastAdapter(value.forecastWeatherUIModel.slice(1 until value.forecastWeatherUIModel.size))

    }

    private fun handleError(failure: Failure) {
        when (failure) {
            is Failure.FeatureFailure -> TODO()
            Failure.LocationIsDisabledError -> {
                showLocationSettings()
            }
            Failure.NetworkConnection -> TODO()
            Failure.ServerError -> TODO()
            Failure.ServerTimeoutError -> TODO()
            Failure.UnknownError -> TODO()
            Failure.FineLocationPermissionNotGrantedError -> {
                requestPermissionWithRationale(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE,
                    fineLocationRationalDialog
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val fineLocationRationalDialog by lazy {
           AlertDialog.Builder(requireContext(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT)
            .setMessage(getString(R.string.fine_location_permission_rationale))
            .setCancelable(false)
            .setPositiveButton(
                getString(R.string.ok)
            ) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.CloseDialog)
                requestPermissions(
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE
                )

            }
            .setNegativeButton(android.R.string.cancel) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.InitialIntent)
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        Log.d(TAG, "onRequestPermissionResult()")

        if (requestCode == REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE) {
            when {
                grantResults.isEmpty() ->
                    // If user interaction was interrupted, the permission request
                    // is cancelled and you receive an empty array.
                    Log.d(TAG, "User interaction was cancelled.")

                grantResults[0] == PackageManager.PERMISSION_GRANTED -> {
                    requestCurrentLocation()
                }

                else -> {
                   /* Snackbar.make(
                        binding.container,
                        R.string.fine_permission_denied_explanation,
                        Snackbar.LENGTH_INDEFINITE
                    ).setBackgroundTint(resources.getColor(android.R.color.white))
                        .setAction(R.string.settings) {
                            // Build intent that displays the App settings screen.
                            val intent = Intent()
                            intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                            val uri = Uri.fromParts(
                                "package",
                                BuildConfig.APPLICATION_ID,
                                null
                            )
                            intent.data = uri
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                        }
                        .show()*/
                }
            }
        }
    }

    private fun showLocationSettings() {
        AlertDialog.Builder(requireContext(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT)
            .setMessage(getString(R.string.enable_gps))
            .setCancelable(false)
            .setPositiveButton(
                getString(R.string.settings)
            ) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.CloseDialog)
                startActivity(
                    Intent(
                        Settings.ACTION_LOCATION_SOURCE_SETTINGS
                    )
                )
            }
            .setNegativeButton(android.R.string.cancel) { _, _ ->
                viewModel.setIntent(MainContract.MainIntent.InitialIntent)
            }
            .show()
    }


    private fun requestCurrentLocation() {
        if ((requireActivity().intent.extras?.getString(FavouriteUiModelID) ?: "").isEmpty()) {
            viewModel.setIntent(MainContract.MainIntent.InitialIntent)
        } else {

            viewModel.setIntent(
                MainContract.MainIntent.LoadFarouriteWeather(
                    requireActivity().intent.extras?.getDouble(FavouriteUiModelLat),
                    requireActivity().intent.extras?.getDouble(FavouriteUiModelLong)
                )
            )
        }

    }


    companion object {
        private const val TAG = "MainActivity"
        private const val REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE = 34
    }

    private fun WeatherType.getColor(): Int {
        return when (this) {
            WeatherType.RAINY -> ContextCompat.getColor(requireContext(), R.color.rainy)
            WeatherType.CLOUDY -> ContextCompat.getColor(requireContext(), R.color.cloudy)
            WeatherType.SUNNY -> ContextCompat.getColor(requireContext(), R.color.sunny)
            else -> {
                ContextCompat.getColor(requireContext(), R.color.sunny)
            }
        }
    }

    private fun WeatherType.getImage(): Int {
        return when (this) {
            WeatherType.RAINY -> R.drawable.forest_rainy
            WeatherType.CLOUDY -> R.drawable.forest_cloudy
            WeatherType.SUNNY -> R.drawable.forest_sunny
            else -> {
                R.drawable.forest_sunny
            }
        }
    }
}