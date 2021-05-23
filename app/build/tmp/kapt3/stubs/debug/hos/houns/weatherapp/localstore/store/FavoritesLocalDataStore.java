package hos.houns.weatherapp.localstore.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lhos/houns/weatherapp/localstore/store/FavoritesLocalDataStore;", "", "database", "Lhos/houns/weatherapp/localstore/database/AppDatabase;", "(Lhos/houns/weatherapp/localstore/database/AppDatabase;)V", "addFavourite", "", "value", "Lhos/houns/weatherapp/localstore/database/Favorite;", "(Lhos/houns/weatherapp/localstore/database/Favorite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavourite", "load", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FavoritesLocalDataStore {
    private final hos.houns.weatherapp.localstore.database.AppDatabase database = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object load(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<hos.houns.weatherapp.localstore.database.Favorite>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavourite(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.database.Favorite value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavourite(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.database.Favorite value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public FavoritesLocalDataStore(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.database.AppDatabase database) {
        super();
    }
}