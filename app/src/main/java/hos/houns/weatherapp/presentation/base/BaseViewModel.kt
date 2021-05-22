package hos.houns.weatherapp.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

interface Intent
interface SideEffect
interface State

abstract class BaseViewModel<Intent : hos.houns.weatherapp.presentation.base.Intent,
        State : hos.houns.weatherapp.presentation.base.State,
        SideEffect : hos.houns.weatherapp.presentation.base.SideEffect> : ViewModel() {

    private val initialState: State by lazy { createInitialState() }
    abstract fun createInitialState(): State

    val currentState: State
        get() = uiState.value

    private val _uiState: MutableStateFlow<State> = MutableStateFlow(initialState)
    val uiState = _uiState.asStateFlow()

    private val _intent: MutableSharedFlow<Intent> = MutableSharedFlow()
    val intent = _intent.asSharedFlow()

    private val _sideEffect: Channel<SideEffect> = Channel()
    val sideEffect = _sideEffect.receiveAsFlow()

    init {
        subscribeIntents()
    }

    /**
     * Start listening to Intnet
     */
    private fun subscribeIntents() {
        viewModelScope.launch {
            intent.collect {
                handleIntent(it)
            }
        }
    }

    /**
     * Handle each intent
     */
    abstract fun handleIntent(event: Intent)


    /**
     * Set new Intent
     */
    fun setIntent(event: Intent) {
        viewModelScope.launch { _intent.emit(event) }
    }


    /**
     * Set new Ui State
     */
    protected fun setState(reduce: State.() -> State) {
        val newState = currentState.reduce()
        _uiState.value = newState
    }

    /**
     * Set new Effect
     */
    protected fun setSideEffect(builder: () -> SideEffect) {
        val effectValue = builder()
        viewModelScope.launch { _sideEffect.send(effectValue) }
    }
}