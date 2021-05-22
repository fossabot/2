package hos.houns.weatherapp.presentation

import com.google.android.libraries.places.api.model.Place
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import hos.houns.weatherapp.presentation.base.Intent
import hos.houns.weatherapp.presentation.base.SideEffect
import hos.houns.weatherapp.presentation.base.State
import kotlinx.coroutines.flow.Flow

class MainContract {
    sealed class MainIntent : Intent {
        object InitialIntent: MainIntent()
        object LoadFavouriteIntent: MainIntent()
        data class AddFavouriteIntent(val place: Place): MainIntent()
        data class DeleteFavouriteIntent(val favouriteUiModel: FavouriteUiModel): MainIntent()
        object CloseDialog: MainIntent()
        data class LoadFarouriteWeather(val latitude:Double?, val longitude:Double?): MainIntent()
    }

    sealed class MainState : State {
        object Initial: MainState()
        object Loading: MainState()
        data class Success(val value: WeatherUiModel):MainState()
        data class Error(val failure: Failure):MainState()
        data class Favourites(val value: Flow<List<FavouriteUiModel>>): MainState()
    }

    sealed class MainSideEffect: SideEffect

}

