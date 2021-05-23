package hos.houns.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ1\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\'\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lhos/houns/weatherapp/data/GetWeatherRepository;", "", "locationManager", "Lhos/houns/weatherapp/device/LocationManager;", "localLocationDataStore", "Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore;", "weatherRemoteDataStore", "Lhos/houns/weatherapp/remotestore/WeatherRemoteDataStore;", "(Lhos/houns/weatherapp/device/LocationManager;Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore;Lhos/houns/weatherapp/remotestore/WeatherRemoteDataStore;)V", "fetchCurrentWeatherAndMapToUIModel", "Lhos/houns/weatherapp/domain/entity/CurrentWeatherUIModel;", "currentLocation", "Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "isFavourite", "", "(Lhos/houns/weatherapp/domain/entity/CurrentLocation;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDataCurrentAndForeCast", "Lhos/houns/weatherapp/domain/core/Either$Right;", "Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "fetchForeCastWeatherAndMapToUIModel", "", "Lhos/houns/weatherapp/domain/entity/ForecastWeatherUIModel;", "getWeather", "Lhos/houns/weatherapp/domain/core/Either;", "Lhos/houns/weatherapp/domain/core/Failure;", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToLocal", "", "currentWeatherUIModel", "foreCastWeatherUIModel", "(Lhos/houns/weatherapp/domain/entity/CurrentWeatherUIModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetWeatherRepository {
    private final hos.houns.weatherapp.device.LocationManager locationManager = null;
    private final hos.houns.weatherapp.localstore.store.LocalLocationDataStore localLocationDataStore = null;
    private final hos.houns.weatherapp.remotestore.WeatherRemoteDataStore weatherRemoteDataStore = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeather(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.core.Either<? extends hos.houns.weatherapp.domain.core.Failure, hos.houns.weatherapp.domain.entity.WeatherUiModel>> p2) {
        return null;
    }
    
    public GetWeatherRepository(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.device.LocationManager locationManager, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.store.LocalLocationDataStore localLocationDataStore, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.remotestore.WeatherRemoteDataStore weatherRemoteDataStore) {
        super();
    }
}