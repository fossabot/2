package hos.houns.weatherapp.remotestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lhos/houns/weatherapp/remotestore/WeatherRemoteDataStore;", "", "openWeatherApi", "Lhos/houns/weatherapp/remotestore/OpenWeatherApi;", "remoteErrorFactory", "Lhos/houns/weatherapp/remotestore/RemoteErrorFactory;", "(Lhos/houns/weatherapp/remotestore/OpenWeatherApi;Lhos/houns/weatherapp/remotestore/RemoteErrorFactory;)V", "currentWeather", "Lhos/houns/weatherapp/domain/core/Either;", "Lhos/houns/weatherapp/domain/core/Failure;", "Lhos/houns/weatherapp/remotestore/CurrentWeatherResponse;", "location", "Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "(Lhos/houns/weatherapp/domain/entity/CurrentLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecastWeather", "Lhos/houns/weatherapp/remotestore/ForecastResponse;", "app_debug"})
public final class WeatherRemoteDataStore {
    private final hos.houns.weatherapp.remotestore.OpenWeatherApi openWeatherApi = null;
    private final hos.houns.weatherapp.remotestore.RemoteErrorFactory remoteErrorFactory = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object currentWeather(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.entity.CurrentLocation location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.core.Either<? extends hos.houns.weatherapp.domain.core.Failure, hos.houns.weatherapp.remotestore.CurrentWeatherResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object forecastWeather(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.entity.CurrentLocation location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.core.Either<? extends hos.houns.weatherapp.domain.core.Failure, hos.houns.weatherapp.remotestore.ForecastResponse>> p1) {
        return null;
    }
    
    public WeatherRemoteDataStore(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.remotestore.OpenWeatherApi openWeatherApi, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.remotestore.RemoteErrorFactory remoteErrorFactory) {
        super();
    }
}