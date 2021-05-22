package hos.houns.weatherapp

import androidx.room.Room
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import hos.houns.weatherapp.data.GetWeatherRepositoryImpl
import hos.houns.weatherapp.data.LocalLocationDataStore
import hos.houns.weatherapp.data.WeatherRemoteDataStore
import hos.houns.weatherapp.data.favorite.FavoritesLocalDataStore
import hos.houns.weatherapp.data.favorite.FavoritesRepositoryImpl
import hos.houns.weatherapp.device.LocationManagerImpl
import hos.houns.weatherapp.domain.core.CoroutineDispatchers
import hos.houns.weatherapp.domain.core.CoroutineDispatchersImpl
import hos.houns.weatherapp.domain.usecases.*
import hos.houns.weatherapp.domain.usecases.favourite.*
import hos.houns.weatherapp.localstore.favorite.AppDatabase
import hos.houns.weatherapp.localstore.favorite.FavoritesLocalDataStoreImpl
import hos.houns.weatherapp.localstore.LocalLocationDataStoreImpl
import hos.houns.weatherapp.presentation.MainViewModel
import hos.houns.weatherapp.remotestore.OpenWeatherApi
import hos.houns.weatherapp.remotestore.RemoteErrorFactory
import hos.houns.weatherapp.remotestore.WeatherRemoteDataStoreImpl
import hos.houns.weatherapp.remotestore.retrofit.NoConnectionInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val modules = module {

    // Domain Layer

    single<CoroutineDispatchers> { CoroutineDispatchersImpl() }
    single<GetWeatherUseCase> { GetWeatherUseCaseImpl(get()) }
    single<LoadFavouritesUseCase> { LoadFavouritesUseCaseImpl(get()) }
    single<AddDeleteFavouriteUseCase> { AddDeleteFavouriteUseCaseImpl(get()) }

    //Remote layer

    single { provideRetrofit("https://api.openweathermap.org/data/2.5/", get(), get()) }
    single { provideGson() }
    single { provideOkHttpClient(get()) }
    factory { NoConnectionInterceptor(get()) }
    single<WeatherRemoteDataStore> { WeatherRemoteDataStoreImpl(get(), get()) }
    single { OpenWeatherApi(get()) }
    single { RemoteErrorFactory() }
    single<GetWeatherRepository> { GetWeatherRepositoryImpl(get(), get(), get(), get()) }

    single<FavouritesRepository> { FavoritesRepositoryImpl(get(), get()) }
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java, "database-weather"
        ).build()
    }


    single<FavoritesLocalDataStore> { FavoritesLocalDataStoreImpl(get(),get()) }


    //Device layer
    single<LocationManager> { LocationManagerImpl(get(), get()) }

    single<LocalLocationDataStore> { LocalLocationDataStoreImpl(get()) }

    // Presentation

    viewModel {
        MainViewModel(get(),get(),get())
    }
}


private fun provideGson(): Gson {
    return GsonBuilder()
        .setLenient()
        .create()
}


private fun provideRetrofit(baseUrl: String, gson: Gson, client: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .client(client)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl(baseUrl)
        .build()
}


private fun provideOkHttpClient(networkInterceptor: NoConnectionInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(120, TimeUnit.SECONDS)
        .readTimeout(120, TimeUnit.SECONDS)
        .writeTimeout(120, TimeUnit.SECONDS)
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .addInterceptor(networkInterceptor)
        .build()
}
