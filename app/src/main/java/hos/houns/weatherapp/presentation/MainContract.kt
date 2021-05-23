package hos.houns.weatherapp.presentation

import com.google.android.libraries.places.api.model.Place
import hos.houns.weatherapp.domain.core.Failure
import hos.houns.weatherapp.domain.entity.CurrentLocation
import hos.houns.weatherapp.domain.entity.FavoriteUiModel
import hos.houns.weatherapp.domain.entity.WeatherUiModel
import hos.houns.weatherapp.presentation.base.Intent
import hos.houns.weatherapp.presentation.base.State
import kotlinx.coroutines.flow.Flow

class MainContract {
    sealed class MainIntent : Intent {
        object InitialIntent: MainIntent()
        object LoadFavoriteIntent: MainIntent()
        data class AddFavoriteIntent(val place: Place): MainIntent()
        data class DeleteFavoriteIntent(val favoriteUiModel: FavoriteUiModel): MainIntent()
        object CloseDialog: MainIntent()
        data class LoadFavoriteWeather(val latitude:Double?, val longitude:Double?): MainIntent()
        object LastPosition:MainIntent()
    }

    sealed class MainState : State {
        object Initial: MainState()
        object Loading: MainState()
        data class Success(val value: WeatherUiModel):MainState()
        data class Error(val failure: Failure):MainState()
        data class Favorites(val value: Flow<List<FavoriteUiModel>>): MainState()
        data class LastPosition(val value: CurrentLocation):MainState()
    }

}

