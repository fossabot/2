package hos.houns.weatherapp.domain.usecases

import hos.houns.weatherapp.domain.entity.CurrentLocation

interface LocationManager {
    suspend fun  getCurrentLocation():CurrentLocation
    fun isLocationEnabled():Boolean
    fun hasFinePermissionGranted():Boolean
}