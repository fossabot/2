package hos.houns.weatherapp.presentation.favorite

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import hos.houns.weatherapp.databinding.FavouriteItemBinding
import hos.houns.weatherapp.domain.entity.FavoriteUiModel


class FavoritesAdapter(var list: List<FavoriteUiModel>,
                       var onLongClicked : (FavoriteUiModel) -> Unit,
                       var onClicked : (FavoriteUiModel) -> Unit,
) : RecyclerView.Adapter<FavoritesAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: FavouriteItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FavouriteItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.favourite.text = list[position].label
        holder.binding.root.setOnLongClickListener {
            println("ererzerzr")
            onLongClicked.invoke(list[position])
            true
        }

        holder.binding.root.setOnClickListener {
            onClicked.invoke(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}