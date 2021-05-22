package hos.houns.weatherapp.domain.core

sealed class Failure {
    object NetworkConnection : Failure()
    object ServerError : Failure()
    object UnknownError : Failure()
    object ServerTimeoutError : Failure()
    object LocationIsDisabledError : Failure()
    object FineLocationPermissionNotGrantedError : Failure()
    abstract class FeatureFailure(val message: String) : Failure()
}

