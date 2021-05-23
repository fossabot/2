package hos.houns.weatherapp.localstore.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Favorite(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "label") val label:String?,
    @ColumnInfo(name = "latitude") val latitude:Double?,
    @ColumnInfo(name = "longitude") val longitude:Double?)
