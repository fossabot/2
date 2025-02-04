package hos.houns.weatherapp.remotestore.retrofit

import hos.houns.weatherapp.domain.core.Failure
import retrofit2.HttpException
import retrofit2.Response
import java.net.SocketTimeoutException


interface BaseFailureFactory {
    fun produce(exception: Exception): Failure
}

const val HTTP_INTERNAL_SERVER_ERROR = 500

abstract class FailureFactory : BaseFailureFactory {

    abstract fun handleFeatureError(error: ApiError): Failure

    override fun produce(exception: Exception): Failure {
        return when (exception) {
            is SocketTimeoutException -> Failure.NetworkError
            is HttpException -> {
                val response = exception.response()
                return handleHttpCode(response)
            }
            is NoConnectionInterceptor.NoConnectivityException, NoConnectionInterceptor.NoInternetException ->{
                Failure.NetworkError
            }
            else -> Failure.UnknownError
        }
    }

    private fun <T> handleHttpCode(response: Response<T>?): Failure {
        return when (response?.code()) {
            HTTP_INTERNAL_SERVER_ERROR -> Failure.NetworkError
            else -> Failure.UnknownError
        }
    }
}
