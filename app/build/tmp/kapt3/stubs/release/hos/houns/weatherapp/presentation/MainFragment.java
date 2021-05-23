package hos.houns.weatherapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J+\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0012H\u0016J\u001a\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0012H\u0002J\f\u00101\u001a\u00020%*\u000202H\u0002J\f\u00103\u001a\u00020%*\u000202H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lhos/houns/weatherapp/presentation/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lhos/houns/weatherapp/databinding/FragmentMainBinding;", "binding", "getBinding", "()Lhos/houns/weatherapp/databinding/FragmentMainBinding;", "fineLocationRationalDialog", "Landroid/app/AlertDialog$Builder;", "kotlin.jvm.PlatformType", "getFineLocationRationalDialog", "()Landroid/app/AlertDialog$Builder;", "fineLocationRationalDialog$delegate", "Lkotlin/Lazy;", "viewModel", "Lhos/houns/weatherapp/presentation/MainViewModel;", "handleError", "", "failure", "Lhos/houns/weatherapp/domain/core/Failure;", "handleSuccess", "value", "Lhos/houns/weatherapp/domain/entity/WeatherUiModel;", "initObservers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "requestCurrentLocation", "showLocationSettings", "getColor", "Lhos/houns/weatherapp/domain/entity/WeatherType;", "getImage", "Companion", "app_release"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private hos.houns.weatherapp.databinding.FragmentMainBinding _binding;
    private hos.houns.weatherapp.presentation.MainViewModel viewModel;
    private final kotlin.Lazy fineLocationRationalDialog$delegate = null;
    private static final java.lang.String TAG = "MainActivity";
    private static final int REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE = 34;
    public static final hos.houns.weatherapp.presentation.MainFragment.Companion Companion = null;
    
    private final hos.houns.weatherapp.databinding.FragmentMainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void initObservers() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void handleSuccess(hos.houns.weatherapp.domain.entity.WeatherUiModel value) {
    }
    
    private final void handleError(hos.houns.weatherapp.domain.core.Failure failure) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final android.app.AlertDialog.Builder getFineLocationRationalDialog() {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void showLocationSettings() {
    }
    
    private final void requestCurrentLocation() {
    }
    
    private final int getColor(hos.houns.weatherapp.domain.entity.WeatherType $this$getColor) {
        return 0;
    }
    
    private final int getImage(hos.houns.weatherapp.domain.entity.WeatherType $this$getImage) {
        return 0;
    }
    
    public MainFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/presentation/MainFragment$Companion;", "", "()V", "REQUEST_FINE_LOCATION_PERMISSIONS_REQUEST_CODE", "", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}