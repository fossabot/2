package hos.houns.weatherapp.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import hos.houns.weatherapp.R
import hos.houns.weatherapp.databinding.ForecastItemBinding
import hos.houns.weatherapp.domain.entity.ForecastWeatherUIModel
import hos.houns.weatherapp.domain.entity.WeatherType


class ForecastAdapter(var list: List<ForecastWeatherUIModel>) : RecyclerView.Adapter<ForecastAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: ForecastItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ForecastItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.day.text = list[position].day
        holder.binding.temp.text = list[position].temp.toString().withDegree()
        holder.binding.image.setBackgroundResource(list[position].type.getImage())
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private fun WeatherType.getImage(): Int {
        return  when(this){
            WeatherType.RAINY -> R.drawable.rain
            WeatherType.CLOUDY -> R.drawable.partlysunny
            WeatherType.SUNNY -> R.drawable.clear
            else ->{
                R.drawable.clear
            }
        }
    }
}