package hos.houns.weatherapp.remotestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/remotestore/RemoteErrorFactory;", "Lhos/houns/weatherapp/remotestore/retrofit/FailureFactory;", "()V", "handleFeatureError", "Lhos/houns/weatherapp/domain/core/Failure;", "error", "Lhos/houns/weatherapp/remotestore/retrofit/ApiError;", "app_release"})
public final class RemoteErrorFactory extends hos.houns.weatherapp.remotestore.retrofit.FailureFactory {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public hos.houns.weatherapp.domain.core.Failure handleFeatureError(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.remotestore.retrofit.ApiError error) {
        return null;
    }
    
    public RemoteErrorFactory() {
        super();
    }
}