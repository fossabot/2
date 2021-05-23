package hos.houns.weatherapp.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u0014\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001d\u00a2\u0006\u0002\b\u001eH\u0004J\b\u0010\u001f\u001a\u00020\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00028\u00018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lhos/houns/weatherapp/presentation/base/BaseViewModel;", "Intent", "Lhos/houns/weatherapp/presentation/base/Intent;", "State", "Lhos/houns/weatherapp/presentation/base/State;", "Landroidx/lifecycle/ViewModel;", "()V", "_intent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "initialState", "getInitialState", "()Lhos/houns/weatherapp/presentation/base/State;", "initialState$delegate", "Lkotlin/Lazy;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "createInitialState", "handleIntent", "", "intent", "(Lhos/houns/weatherapp/presentation/base/Intent;)V", "setIntent", "event", "setState", "reduce", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "subscribeIntents", "app_release"})
public abstract class BaseViewModel<Intent extends hos.houns.weatherapp.presentation.base.Intent, State extends hos.houns.weatherapp.presentation.base.State> extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy initialState$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<State> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<State> uiState = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<Intent> _intent = null;
    
    private final State getInitialState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract State createInitialState();
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<State> getUiState() {
        return null;
    }
    
    /**
     * Start listening to Intnet
     */
    private final void subscribeIntents() {
    }
    
    /**
     * Handle each intent
     */
    protected abstract void handleIntent(@org.jetbrains.annotations.NotNull()
    Intent intent);
    
    /**
     * Set new Intent
     */
    public final void setIntent(@org.jetbrains.annotations.NotNull()
    Intent event) {
    }
    
    /**
     * Set new Ui State
     */
    protected final void setState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super State, ? extends State> reduce) {
    }
    
    public BaseViewModel() {
        super();
    }
}