package hos.houns.weatherapp.presentation

import androidx.lifecycle.viewModelScope
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.domain.usecases.*
import hos.houns.weatherapp.domain.usecases.favorite.AddDeleteFavouriteUseCase
import hos.houns.weatherapp.domain.usecases.favorite.LoadFavoritesUseCase
import hos.houns.weatherapp.presentation.base.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(
    private val getWeatherUseCase: GetWeatherUseCase,
    private val loadFavoritesUseCase: LoadFavoritesUseCase,
    private val addDeleteFavouriteUseCase: AddDeleteFavouriteUseCase
): BaseViewModel<MainContract.MainIntent, MainContract.MainState>() {
    override fun createInitialState(): MainContract.MainState {
        return  MainContract.MainState.Initial
    }

    override fun handleIntent(event: MainContract.MainIntent) {
       when(event){
           MainContract.MainIntent.InitialIntent -> {
               setState { MainContract.MainState.Loading}
               viewModelScope.launch {
                   when(val usecase= getWeatherUseCase.execute(null,null)){
                       is GetWeatherResult.Error -> setState { MainContract.MainState.Error(usecase.error)}
                       is GetWeatherResult.Success -> setState { MainContract.MainState.Success(usecase.value)}
                   }
               }
           }
           MainContract.MainIntent.CloseDialog -> {}
           MainContract.MainIntent.LoadFavouriteIntent -> {
               viewModelScope.launch {
                   val usecase=loadFavoritesUseCase.execute()
                   setState { MainContract.MainState.Favourites(usecase.value) }
               }
           }
           is MainContract.MainIntent.LoadFarouriteWeather -> {
               setState { MainContract.MainState.Loading}
               viewModelScope.launch {
                   when(val usecase= getWeatherUseCase.execute(event.latitude,event.longitude)){
                       is GetWeatherResult.Error -> setState { MainContract.MainState.Error(usecase.error)}
                       is GetWeatherResult.Success -> setState { MainContract.MainState.Success(usecase.value)}
                   }
               }
           }
           is MainContract.MainIntent.AddFavouriteIntent -> {
               viewModelScope.launch {
                   addDeleteFavouriteUseCase.execute(FavoriteUiModel(event.place.id?:"",
                       event.place.name?:"",
                       event.place.latLng?.latitude?:0.0,
                       event.place.latLng?.longitude?:0.0),false)
               }
           }

           is MainContract.MainIntent.DeleteFavouriteIntent -> {
               viewModelScope.launch {
                   addDeleteFavouriteUseCase.execute(event.favoriteUiModel,true)
               }
           }

       }
    }
}