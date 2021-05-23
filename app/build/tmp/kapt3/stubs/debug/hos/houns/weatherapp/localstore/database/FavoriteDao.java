package hos.houns.weatherapp.localstore.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H\'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lhos/houns/weatherapp/localstore/database/FavoriteDao;", "", "delete", "", "user", "Lhos/houns/weatherapp/localstore/database/Favorite;", "findById", "Lkotlinx/coroutines/flow/Flow;", "id", "", "getAll", "", "insertAll", "favorites", "", "([Lhos/houns/weatherapp/localstore/database/Favorite;)V", "app_debug"})
public abstract interface FavoriteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorite")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.localstore.database.Favorite>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorite WHERE id LIKE :id LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<hos.houns.weatherapp.localstore.database.Favorite> findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.database.Favorite... favorites);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.database.Favorite user);
}