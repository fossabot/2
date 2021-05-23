package hos.houns.weatherapp.device;

import java.lang.System;

@android.annotation.SuppressLint(value = {"MissingPermission"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lhos/houns/weatherapp/device/LocationManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCurrentLocation", "Lhos/houns/weatherapp/domain/entity/CurrentLocation;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasFinePermissionGranted", "", "isLocationEnabled", "app_debug"})
public final class LocationManager {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.entity.CurrentLocation> p0) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ServiceCast"})
    public final boolean isLocationEnabled() {
        return false;
    }
    
    public final boolean hasFinePermissionGranted() {
        return false;
    }
    
    public LocationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}