package hos.houns.weatherapp.presentation.favourite

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import hos.houns.weatherapp.R
import hos.houns.weatherapp.databinding.FavouriteItemBinding
import hos.houns.weatherapp.databinding.ForecastItemBinding
import hos.houns.weatherapp.domain.entity.FavouriteUiModel
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType
import hos.houns.weatherapp.presentation.*


class FavouritesAdapter(var list: List<FavouriteUiModel>,
                        var onLongClicked : (FavouriteUiModel) -> Unit,
                        var onClicked : (FavouriteUiModel) -> Unit,
) : RecyclerView.Adapter<FavouritesAdapter.ViewHolder>(){
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