package hos.houns.weatherapp.presentation.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lhos/houns/weatherapp/presentation/favorite/PlaceAutocompleteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "AUTOCOMPLETE_REQUEST_CODE", "", "binding", "Lhos/houns/weatherapp/databinding/PlaceAutocompleteBinding;", "viewModel", "Lhos/houns/weatherapp/presentation/MainViewModel;", "initObservers", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showDeletionPopup", "favoriteUiModel", "Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "app_debug"})
public final class PlaceAutocompleteActivity extends androidx.appcompat.app.AppCompatActivity {
    private hos.houns.weatherapp.databinding.PlaceAutocompleteBinding binding;
    private final int AUTOCOMPLETE_REQUEST_CODE = 1;
    private hos.houns.weatherapp.presentation.MainViewModel viewModel;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initObservers() {
    }
    
    private final void showDeletionPopup(hos.houns.weatherapp.domain.entity.FavoriteUiModel favoriteUiModel) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public PlaceAutocompleteActivity() {
        super();
    }
}