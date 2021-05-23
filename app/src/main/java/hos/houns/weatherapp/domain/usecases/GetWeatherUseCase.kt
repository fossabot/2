package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.data.GetWeatherRepository
import hos.houns.weatherapp.device.LocationManager
import hos.houns.weatherapp.domain.core.Either
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore

class GetWeatherUseCase(
    private val repository: GetWeatherRepository,
    private val locationManager: LocationManager,
    private val localLocationDataStore: LocalLocationDataStore,
) {

    /** I use the same usecase to get the weather of the user and the weather of a favorite place.
     * Since We don't know the user's location when we launch the usecase, his latitude and his longitude are null.
     *
     * @param latitude : is null if it is the user's location.
     * it has a not nullable value if we try to get the weather of a favorite place
     *
     * @param longitude : is null if it is the user's location.
     * it has a not nullable value if we try to get the weather of a favorite place
     * */
    suspend fun execute(latitude: Double?, longitude: Double?): GetWeatherResult {

        //   Get the  weather of favorite place
        return if (latitude != null && longitude != null) {

            getWeatherResult(latitude, longitude, true)

        }
        //  Get user's weather base on his location
        else if (locationManager.isLocationEnabled() && locationManager.hasFinePermissionGranted()) {

            val currentLocation = locationManager.getCurrentLocation()
            getWeatherResult(
                currentLocation.latitude,
                currentLocation.longitude,
                false
            )

        }
        // If the user disable the location manager
        else if (!locationManager.isLocationEnabled()) {

            // I get the last location from the local storage
            val lastLocation = localLocationDataStore.getLastLocation()

            // If the location was never set in shared preference
            if (lastLocation == CurrentLocation(0.0, 0.0)) {
                GetWeatherResult.Error(Failure.LocationIsDisabledError)
            } else {
                // i fecch data base on the last position of the user
                getWeatherResult(lastLocation.latitude, lastLocation.longitude, false)
            }
        } else {
            GetWeatherResult.Error(Failure.FineLocationPermissionNotGrantedError)
        }

    }

    private suspend fun getWeatherResult(
        latitude: Double,
        longitude: Double,
        isFavourite: Boolean
    ) = when (val result = repository.getWeather(latitude, longitude, isFavourite)) {
        is Either.Left -> GetWeatherResult.Error(result.a)
        is Either.Right -> GetWeatherResult.Success(result.b)
    }

    sealed class GetWeatherResult {
        data class Success(val value: WeatherUiModel) : GetWeatherResult()
        data class Error(val error: Failure) : GetWeatherResult()
    }
}

