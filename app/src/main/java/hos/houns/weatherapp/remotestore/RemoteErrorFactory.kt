package hos.houns.weatherapp.remotestore

import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.remotestore.retrofit.ApiError
import hos.houns.weatherapp.remotestore.retrofit.FailureFactory

class RemoteErrorFactory : FailureFactory() {
    override fun handleFeatureError(error: ApiError): Failure {
        return when (error.status) {

            else -> Failure.UnknownError
        }
    }
}