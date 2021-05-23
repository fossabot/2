package hos.houns.weatherapp.remotestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ9\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJM\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lhos/houns/weatherapp/remotestore/OpenWeatherApi;", "", "currentWeather", "Lhos/houns/weatherapp/remotestore/CurrentWeatherResponse;", "appId", "", "lat", "lon", "units", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forecastWeather", "Lhos/houns/weatherapp/remotestore/ForecastResponse;", "cnt", "exclude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"})
public abstract interface OpenWeatherApi {
    public static final hos.houns.weatherapp.remotestore.OpenWeatherApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPEN_WEATHER_API = "de101acfae21bbea418e3614631fcbeb";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_WEATHER = "weather";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORECAST_WEATHER = "onecall";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIT_METRIC = "metric";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIMIT = "5";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object currentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.remotestore.CurrentWeatherResponse> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "onecall")
    public abstract java.lang.Object forecastWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lon")
    java.lang.String lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "cnt")
    java.lang.String cnt, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "exclude")
    java.lang.String exclude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.remotestore.ForecastResponse> p6);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lhos/houns/weatherapp/remotestore/OpenWeatherApi$Companion;", "", "()V", "CURRENT_WEATHER", "", "FORECAST_WEATHER", "LIMIT", "OPEN_WEATHER_API", "UNIT_METRIC", "invoke", "Lhos/houns/weatherapp/remotestore/OpenWeatherApi;", "retrofit", "Lretrofit2/Retrofit;", "app_release"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OPEN_WEATHER_API = "de101acfae21bbea418e3614631fcbeb";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CURRENT_WEATHER = "weather";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FORECAST_WEATHER = "onecall";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNIT_METRIC = "metric";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LIMIT = "5";
        
        @org.jetbrains.annotations.NotNull()
        public final hos.houns.weatherapp.remotestore.OpenWeatherApi invoke(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}