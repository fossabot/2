package hos.houns.weatherapp.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/LoadFavoritesUseCase;", "", "repository", "Lhos/houns/weatherapp/data/FavoritesRepository;", "(Lhos/houns/weatherapp/data/FavoritesRepository;)V", "execute", "Lhos/houns/weatherapp/domain/usecases/LoadFavoritesUseCase$LoadFavoriteResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoadFavoriteResult", "app_release"})
public final class LoadFavoritesUseCase {
    private final hos.houns.weatherapp.data.FavoritesRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super hos.houns.weatherapp.domain.usecases.LoadFavoritesUseCase.LoadFavoriteResult> p0) {
        return null;
    }
    
    public LoadFavoritesUseCase(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.data.FavoritesRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lhos/houns/weatherapp/domain/usecases/LoadFavoritesUseCase$LoadFavoriteResult;", "", "value", "Lkotlinx/coroutines/flow/Flow;", "", "Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "(Lkotlinx/coroutines/flow/Flow;)V", "getValue", "()Lkotlinx/coroutines/flow/Flow;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
    public static final class LoadFavoriteResult {
        @org.jetbrains.annotations.NotNull()
        private final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> getValue() {
            return null;
        }
        
        public LoadFavoriteResult(@org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.flow.Flow<? extends java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.Flow<java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel>> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final hos.houns.weatherapp.domain.usecases.LoadFavoritesUseCase.LoadFavoriteResult copy(@org.jetbrains.annotations.NotNull()
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
}