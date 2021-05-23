package hos.houns.weatherapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\f\u0010\u0014\u001a\u00020\u000b*\u00020\u0015H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lhos/houns/weatherapp/presentation/ForecastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhos/houns/weatherapp/presentation/ForecastAdapter$ViewHolder;", "list", "", "Lhos/houns/weatherapp/domain/entity/ForecastWeatherUIModel;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "setList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getImage", "Lhos/houns/weatherapp/domain/entity/WeatherType;", "ViewHolder", "app_release"})
public final class ForecastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<hos.houns.weatherapp.presentation.ForecastAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel> list;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public hos.houns.weatherapp.presentation.ForecastAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.presentation.ForecastAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final int getImage(hos.houns.weatherapp.domain.entity.WeatherType $this$getImage) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel> p0) {
    }
    
    public ForecastAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/presentation/ForecastAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lhos/houns/weatherapp/databinding/ForecastItemBinding;", "(Lhos/houns/weatherapp/presentation/ForecastAdapter;Lhos/houns/weatherapp/databinding/ForecastItemBinding;)V", "getBinding", "()Lhos/houns/weatherapp/databinding/ForecastItemBinding;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final hos.houns.weatherapp.databinding.ForecastItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final hos.houns.weatherapp.databinding.ForecastItemBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        hos.houns.weatherapp.databinding.ForecastItemBinding binding) {
            super(null);
        }
    }
}