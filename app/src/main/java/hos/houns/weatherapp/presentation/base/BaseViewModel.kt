package hos.houns.weatherapp.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

interface Intent
interface State

abstract class BaseViewModel<Intent : hos.houns.weatherapp.presentation.base.Intent,
        State : hos.houns.weatherapp.presentation.base.State> : ViewModel() {

    private val initialState: State by lazy { createInitialState() }
    abstract fun createInitialState(): State

    private val _uiState: MutableStateFlow<State> = MutableStateFlow(initialState)
    val uiState = _uiState.asStateFlow()

    private val _intent: MutableSharedFlow<Intent> = MutableSharedFlow()

    init {
        subscribeIntents()
    }

    /**
     * Start listening to Intnet
     */
    private fun subscribeIntents() {
        viewModelScope.launch {
            _intent.collect {
                handleIntent(it)
            }
        }
    }

    /**
     * Handle each intent
     */
    protected abstract fun handleIntent(intent: Intent)


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
        val newState = uiState.value.reduce()
        _uiState.value = newState
    }


}