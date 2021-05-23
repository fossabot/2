package hos.houns.weatherapp.presentation.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\b2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lhos/houns/weatherapp/presentation/favorite/FavoritesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhos/houns/weatherapp/presentation/favorite/FavoritesAdapter$ViewHolder;", "list", "", "Lhos/houns/weatherapp/domain/entity/FavoriteUiModel;", "onLongClicked", "Lkotlin/Function1;", "", "onClicked", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getOnClicked", "()Lkotlin/jvm/functions/Function1;", "setOnClicked", "(Lkotlin/jvm/functions/Function1;)V", "getOnLongClicked", "setOnLongClicked", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class FavoritesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<hos.houns.weatherapp.presentation.favorite.FavoritesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel> list;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> onLongClicked;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> onClicked;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public hos.houns.weatherapp.presentation.favorite.FavoritesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    hos.houns.weatherapp.presentation.favorite.FavoritesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> getOnLongClicked() {
        return null;
    }
    
    public final void setOnLongClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> getOnClicked() {
        return null;
    }
    
    public final void setOnClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> p0) {
    }
    
    public FavoritesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<hos.houns.weatherapp.domain.entity.FavoriteUiModel> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> onLongClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super hos.houns.weatherapp.domain.entity.FavoriteUiModel, kotlin.Unit> onClicked) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lhos/houns/weatherapp/presentation/favorite/FavoritesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lhos/houns/weatherapp/databinding/FavouriteItemBinding;", "(Lhos/houns/weatherapp/presentation/favorite/FavoritesAdapter;Lhos/houns/weatherapp/databinding/FavouriteItemBinding;)V", "getBinding", "()Lhos/houns/weatherapp/databinding/FavouriteItemBinding;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final hos.houns.weatherapp.databinding.FavouriteItemBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final hos.houns.weatherapp.databinding.FavouriteItemBinding getBinding() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        hos.houns.weatherapp.databinding.FavouriteItemBinding binding) {
            super(null);
        }
    }
}