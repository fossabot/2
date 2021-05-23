package hos.houns.weatherapp.remotestore.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/remotestore/retrofit/BaseFailureFactory;", "", "produce", "Lhos/houns/weatherapp/domain/core/Failure;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_release"})
public abstract interface BaseFailureFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract hos.houns.weatherapp.domain.core.Failure produce(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception);
}