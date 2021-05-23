package hos.houns.weatherapp.remotestore.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\nH\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lhos/houns/weatherapp/remotestore/retrofit/FailureFactory;", "Lhos/houns/weatherapp/remotestore/retrofit/BaseFailureFactory;", "()V", "handleFeatureError", "Lhos/houns/weatherapp/domain/core/Failure;", "error", "Lhos/houns/weatherapp/remotestore/retrofit/ApiError;", "handleHttpCode", "T", "response", "Lretrofit2/Response;", "produce", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_debug"})
public abstract class FailureFactory implements hos.houns.weatherapp.remotestore.retrofit.BaseFailureFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract hos.houns.weatherapp.domain.core.Failure handleFeatureError(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.remotestore.retrofit.ApiError error);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public hos.houns.weatherapp.domain.core.Failure produce(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
        return null;
    }
    
    private final <T extends java.lang.Object>hos.houns.weatherapp.domain.core.Failure handleHttpCode(retrofit2.Response<T> response) {
        return null;
    }
    
    public FailureFactory() {
        super();
    }
}