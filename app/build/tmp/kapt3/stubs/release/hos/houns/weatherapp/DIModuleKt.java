package hos.houns.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0010"}, d2 = {"modules", "Lorg/koin/core/module/Module;", "getModules", "()Lorg/koin/core/module/Module;", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "networkInterceptor", "Lhos/houns/weatherapp/remotestore/retrofit/NoConnectionInterceptor;", "provideRetrofit", "Lretrofit2/Retrofit;", "baseUrl", "", "gson", "client", "app_release"})
public final class DIModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module modules = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getModules() {
        return null;
    }
    
    private static final com.google.gson.Gson provideGson() {
        return null;
    }
    
    private static final retrofit2.Retrofit provideRetrofit(java.lang.String baseUrl, com.google.gson.Gson gson, okhttp3.OkHttpClient client) {
        return null;
    }
    
    private static final okhttp3.OkHttpClient provideOkHttpClient(hos.houns.weatherapp.remotestore.retrofit.NoConnectionInterceptor networkInterceptor) {
        return null;
    }
}