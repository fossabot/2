package hos.houns.weatherapp.domain.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lhos/houns/weatherapp/domain/core/Failure;", "", "()V", "FineLocationPermissionNotGrantedError", "LocationIsDisabledError", "NetworkError", "UnknownError", "Lhos/houns/weatherapp/domain/core/Failure$NetworkError;", "Lhos/houns/weatherapp/domain/core/Failure$UnknownError;", "Lhos/houns/weatherapp/domain/core/Failure$LocationIsDisabledError;", "Lhos/houns/weatherapp/domain/core/Failure$FineLocationPermissionNotGrantedError;", "app_debug"})
public abstract class Failure {
    
    private Failure() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/domain/core/Failure$NetworkError;", "Lhos/houns/weatherapp/domain/core/Failure;", "()V", "app_debug"})
    public static final class NetworkError extends hos.houns.weatherapp.domain.core.Failure {
        public static final hos.houns.weatherapp.domain.core.Failure.NetworkError INSTANCE = null;
        
        private NetworkError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/domain/core/Failure$UnknownError;", "Lhos/houns/weatherapp/domain/core/Failure;", "()V", "app_debug"})
    public static final class UnknownError extends hos.houns.weatherapp.domain.core.Failure {
        public static final hos.houns.weatherapp.domain.core.Failure.UnknownError INSTANCE = null;
        
        private UnknownError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/domain/core/Failure$LocationIsDisabledError;", "Lhos/houns/weatherapp/domain/core/Failure;", "()V", "app_debug"})
    public static final class LocationIsDisabledError extends hos.houns.weatherapp.domain.core.Failure {
        public static final hos.houns.weatherapp.domain.core.Failure.LocationIsDisabledError INSTANCE = null;
        
        private LocationIsDisabledError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lhos/houns/weatherapp/domain/core/Failure$FineLocationPermissionNotGrantedError;", "Lhos/houns/weatherapp/domain/core/Failure;", "()V", "app_debug"})
    public static final class FineLocationPermissionNotGrantedError extends hos.houns.weatherapp.domain.core.Failure {
        public static final hos.houns.weatherapp.domain.core.Failure.FineLocationPermissionNotGrantedError INSTANCE = null;
        
        private FineLocationPermissionNotGrantedError() {
            super();
        }
    }
}