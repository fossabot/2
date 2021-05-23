package hos.houns.weatherapp.domain.core

sealed class Failure {
    object NetworkError : Failure()
    object UnknownError : Failure()
    object LocationIsDisabledError : Failure()
    object FineLocationPermissionNotGrantedError : Failure()
}

