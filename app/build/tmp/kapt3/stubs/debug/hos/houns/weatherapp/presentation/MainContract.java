package hos.houns.weatherapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract;", "", "()V", "MainIntent", "MainState", "app_debug"})
public final class MainContract {
    
    public MainContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "Lhos/houns/weatherapp/presentation/base/Intent;", "()V", "AddFavoriteIntent", "CloseDialog", "DeleteFavoriteIntent", "InitialIntent", "LastPosition", "LoadFavoriteIntent", "LoadFavoriteWeather", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$InitialIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LoadFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$AddFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$DeleteFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$CloseDialog;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LoadFavoriteWeather;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LastPosition;", "app_debug"})
    public static abstract class MainIntent implements hos.houns.weatherapp.presentation.base.Intent {
        
        private MainIntent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$InitialIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "()V", "app_debug"})
        public static final class InitialIntent extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            public static final hos.houns.weatherapp.presentation.MainContract.MainIntent.InitialIntent INSTANCE = null;
            
            private InitialIntent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LoadFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "()V", "app_debug"})
        public static final class LoadFavoriteIntent extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            public static final hos.houns.weatherapp.presentation.MainContract.MainIntent.LoadFavoriteIntent INSTANCE = null;
            
            private LoadFavoriteIntent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$AddFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "place", "Lcom/google/android/libraries/places/api/model/Place;", "(Lcom/google/android/libraries/places/api/model/Place;)V", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AddFavoriteIntent extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            @org.jetbrains.annotations.NotNull()
            private final com.google.android.libraries.places.api.model.Place place = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.libraries.places.api.model.Place getPlace() {
                return null;
            }
            
            public AddFavoriteIntent(@org.jetbrains.annotations.NotNull()
            com.google.android.libraries.places.api.model.Place place) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.libraries.places.api.model.Place component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainIntent.AddFavoriteIntent copy(@org.jetbrains.annotations.NotNull()
            com.google.android.libraries.places.api.model.Place place) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$DeleteFavoriteIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "favoriteUiModel", "Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "(Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;)V", "getFavoriteUiModel", "()Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class DeleteFavoriteIntent extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.entity.FavoriteUiModel favoriteUiModel = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.FavoriteUiModel getFavoriteUiModel() {
                return null;
            }
            
            public DeleteFavoriteIntent(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.FavoriteUiModel favoriteUiModel) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.FavoriteUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainIntent.DeleteFavoriteIntent copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.FavoriteUiModel favoriteUiModel) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$CloseDialog;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "()V", "app_debug"})
        public static final class CloseDialog extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            public static final hos.houns.weatherapp.presentation.MainContract.MainIntent.CloseDialog INSTANCE = null;
            
            private CloseDialog() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LoadFavoriteWeather;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LoadFavoriteWeather;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class LoadFavoriteWeather extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double latitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double longitude = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getLatitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getLongitude() {
                return null;
            }
            
            public LoadFavoriteWeather(@org.jetbrains.annotations.Nullable()
            java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double longitude) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainIntent.LoadFavoriteWeather copy(@org.jetbrains.annotations.Nullable()
            java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double longitude) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainIntent$LastPosition;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "()V", "app_debug"})
        public static final class LastPosition extends hos.houns.weatherapp.presentation.MainContract.MainIntent {
            public static final hos.houns.weatherapp.presentation.MainContract.MainIntent.LastPosition INSTANCE = null;
            
            private LastPosition() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState;", "Lhos/houns/weatherapp/presentation/base/State;", "()V", "Error", "Favorites", "Initial", "LastPosition", "Loading", "Success", "Lhos/houns/weatherapp/presentation/MainContract$MainState$Initial;", "Lhos/houns/weatherapp/presentation/MainContract$MainState$Loading;", "Lhos/houns/weatherapp/presentation/MainContract$MainState$Success;", "Lhos/houns/weatherapp/presentation/MainContract$MainState$Error;", "Lhos/houns/weatherapp/presentation/MainContract$MainState$Favorites;", "Lhos/houns/weatherapp/presentation/MainContract$MainState$LastPosition;", "app_debug"})
    public static abstract class MainState implements hos.houns.weatherapp.presentation.base.State {
        
        private MainState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$Initial;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "()V", "app_debug"})
        public static final class Initial extends hos.houns.weatherapp.presentation.MainContract.MainState {
            public static final hos.houns.weatherapp.presentation.MainContract.MainState.Initial INSTANCE = null;
            
            private Initial() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$Loading;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "()V", "app_debug"})
        public static final class Loading extends hos.houns.weatherapp.presentation.MainContract.MainState {
            public static final hos.houns.weatherapp.presentation.MainContract.MainState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$Success;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "value", "Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "(Lhos/houns/weatherapp/domain/entity/WeatherUiModel;)V", "getValue", "()Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends hos.houns.weatherapp.presentation.MainContract.MainState {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.entity.WeatherUiModel value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.WeatherUiModel getValue() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.WeatherUiModel value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.WeatherUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainState.Success copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.WeatherUiModel value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$Error;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "failure", "Lhos/houns/weatherapp/domain/core/Failure;", "(Lhos/houns/weatherapp/domain/core/Failure;)V", "getFailure", "()Lhos/houns/weatherapp/domain/core/Failure;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends hos.houns.weatherapp.presentation.MainContract.MainState {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.core.Failure failure = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.core.Failure getFailure() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.core.Failure failure) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.core.Failure component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainState.Error copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.core.Failure failure) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$Favorites;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "value", "Lkotlinx/coroutines/flow/Flow;", "", "Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "(Lkotlinx/coroutines/flow/Flow;)V", "getValue", "()Lkotlinx/coroutines/flow/Flow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Favorites extends hos.houns.weatherapp.presentation.MainContract.MainState {
            @org.jetbrains.annotations.NotNull()
            private final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> getValue() {
                return null;
            }
            
            public Favorites(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.flow.Flow<? extends java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainState.Favorites copy(@org.jetbrains.annotations.NotNull()
            kotlinx.coroutines.flow.Flow<? extends java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainContract$MainState$LastPosition;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "value", "Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "(Lhos/houns/weatherapp/domain/entity/CurrentLocation;)V", "getValue", "()Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class LastPosition extends hos.houns.weatherapp.presentation.MainContract.MainState {
            @org.jetbrains.annotations.NotNull()
            private final hos.houns.weatherapp.domain.entity.CurrentLocation value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.CurrentLocation getValue() {
                return null;
            }
            
            public LastPosition(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.CurrentLocation value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.domain.entity.CurrentLocation component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final hos.houns.weatherapp.presentation.MainContract.MainState.LastPosition copy(@org.jetbrains.annotations.NotNull()
            hos.houns.weatherapp.domain.entity.CurrentLocation value) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}