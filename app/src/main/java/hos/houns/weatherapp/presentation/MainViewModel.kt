package hos.houns.weatherapp.presentation

import androidx.lifecycle.viewModelScope
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.domain.usecases.*
import hos.houns.weatherapp.domain.usecases.AddDeleteFavouriteUseCase
import hos.houns.weatherapp.domain.usecases.LoadFavoritesUseCase
import hos.houns.weatherapp.localstore.store.LocalLocationDataStore
import hos.houns.weatherapp.presentation.base.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(
    private val getWeatherUseCase: GetWeatherUseCase,
    private val loadFavoritesUseCase: LoadFavoritesUseCase,
    private val addDeleteFavouriteUseCase: AddDeleteFavouriteUseCase,
    private val localLocationDataStore: LocalLocationDataStore
) : BaseViewModel<MainContract.MainIntent, MainContract.MainState>() {
    override fun createInitialState(): MainContract.MainState {
        return MainContract.MainState.Initial
    }

    override fun handleIntent(intent: MainContract.MainIntent) {
        when (intent) {
            MainContract.MainIntent.InitialIntent -> {
                setState { MainContract.MainState.Loading }
                viewModelScope.launch {
                    when (val usecase = getWeatherUseCase.execute(null, null)) {
                        is GetWeatherUseCase.GetWeatherResult.Error -> setState { MainContract.MainState.Error(usecase.error) }
                        is GetWeatherUseCase.GetWeatherResult.Success -> setState {
                            MainContract.MainState.Success(
                                usecase.value
                            )
                        }
                    }
                }
            }
            MainContract.MainIntent.CloseDialog -> {
            }
            MainContract.MainIntent.LoadFavoriteIntent -> {
                viewModelScope.launch {
                    val usecase = loadFavoritesUseCase.execute()
                    setState { MainContract.MainState.Favorites(usecase.value) }
                }
            }
            is MainContract.MainIntent.LoadFavoriteWeather -> {
                setState { MainContract.MainState.Loading }
                viewModelScope.launch {
                    when (val usecase =
                        getWeatherUseCase.execute(intent.latitude, intent.longitude)) {
                        is GetWeatherUseCase.GetWeatherResult.Error -> setState { MainContract.MainState.Error(usecase.error) }
                        is GetWeatherUseCase.GetWeatherResult.Success -> setState {
                            MainContract.MainState.Success(
                                usecase.value
                            )
                        }
                    }
                }
            }

            is MainContract.MainIntent.AddFavoriteIntent -> {
                viewModelScope.launch {
                    addDeleteFavouriteUseCase.execute(
                        FavoriteUiModel(
                            intent.place.id ?: "",
                            intent.place.name ?: "",
                            intent.place.latLng?.latitude ?: 0.0,
                            intent.place.latLng?.longitude ?: 0.0
                        ), false
                    )
                }
            }

            is MainContract.MainIntent.DeleteFavoriteIntent -> {
                viewModelScope.launch {
                    addDeleteFavouriteUseCase.execute(intent.favoriteUiModel, true)
                }
            }

            MainContract.MainIntent.LastPosition -> viewModelScope.launch {
                val location = localLocationDataStore.getLastLocation()
                setState { MainContract.MainState.LastPosition(location) }
            }
        }
    }
}