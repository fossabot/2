package hos.houns.weatherapp.localstore.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "sharedPref$delegate", "Lkotlin/Lazy;", "getCurrentWeather", "Lhos/houns/weatherapp/domain/entity/CurrentWeatherUIModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForecastWeather", "", "Lhos/houns/weatherapp/domain/entity/ForecastWeatherUIModel;", "getLastLocation", "Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "getUpdatedDate", "", "saveCurrentWeather", "", "weather", "(Lhos/houns/weatherapp/domain/entity/CurrentWeatherUIModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveForecastWeather", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastLocation", "location", "(Lhos/houns/weatherapp/domain/entity/CurrentLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUpdateDate", "date", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"})
public final class LocalLocationDataStore {
    private final kotlin.Lazy sharedPref$delegate = null;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LATITUDE_KEY = "LATITUDE_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LONGITUDE_KEY = "LONGITUDE_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_WEATHER_KEY = "CURRENT_WEATHER_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORECAST_KEY = "FORECAST_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATED_DATE_KEY = "UPDATED_DATE_KEY";
    public static final hos.houns.weatherapp.localstore.store.LocalLocationDataStore.Companion Companion = null;
    
    private final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveLastLocation(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.entity.CurrentLocation location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLastLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.entity.CurrentLocation> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveCurrentWeather(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.entity.CurrentWeatherUIModel> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveForecastWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel> weather, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getForecastWeather(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUpdateDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdatedDate(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    public LocalLocationDataStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore$Companion;", "", "()V", "CURRENT_WEATHER_KEY", "", "FORECAST_KEY", "LATITUDE_KEY", "LONGITUDE_KEY", "UPDATED_DATE_KEY", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}