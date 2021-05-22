package hos.houns.weatherapp.domain.core

interface Result {
    open class Error(val error: Failure) : Result
    open class Success<T>(val data: T) : Result
}
