package hos.houns.weatherapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lhos/houns/weatherapp/presentation/MainViewModel;", "Lhos/houns/weatherapp/presentation/base/BaseViewModel;", "Lhos/houns/weatherapp/presentation/MainContract$MainIntent;", "Lhos/houns/weatherapp/presentation/MainContract$MainState;", "getWeatherUseCase", "Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase;", "loadFavoritesUseCase", "Lhos/houns/weatherapp/domain/usecases/LoadFavoritesUseCase;", "addDeleteFavouriteUseCase", "Lhos/houns/weatherapp/domain/usecases/AddDeleteFavouriteUseCase;", "localLocationDataStore", "Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore;", "(Lhos/houns/weatherapp/domain/usecases/GetWeatherUseCase;Lhos/houns/weatherapp/domain/usecases/LoadFavoritesUseCase;Lhos/houns/weatherapp/domain/usecases/AddDeleteFavouriteUseCase;Lhos/houns/weatherapp/localstore/store/LocalLocationDataStore;)V", "createInitialState", "handleIntent", "", "intent", "app_release"})
public final class MainViewModel extends hos.houns.weatherapp.presentation.base.BaseViewModel<hos.houns.weatherapp.presentation.MainContract.MainIntent, hos.houns.weatherapp.presentation.MainContract.MainState> {
    private final hos.houns.weatherapp.domain.usecases.GetWeatherUseCase getWeatherUseCase = null;
    private final hos.houns.weatherapp.domain.usecases.LoadFavoritesUseCase loadFavoritesUseCase = null;
    private final hos.houns.weatherapp.domain.usecases.AddDeleteFavouriteUseCase addDeleteFavouriteUseCase = null;
    private final hos.houns.weatherapp.localstore.store.LocalLocationDataStore localLocationDataStore = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public hos.houns.weatherapp.presentation.MainContract.MainState createInitialState() {
        return null;
    }
    
    @java.lang.Override()
    protected void handleIntent(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.presentation.MainContract.MainIntent intent) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.usecases.GetWeatherUseCase getWeatherUseCase, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.usecases.LoadFavoritesUseCase loadFavoritesUseCase, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.domain.usecases.AddDeleteFavouriteUseCase addDeleteFavouriteUseCase, @org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.localstore.store.LocalLocationDataStore localLocationDataStore) {
        super();
    }
}