package hos.houns.weatherapp.localstore.favourite

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FavouriteDao {
    @Query("SELECT * FROM favourite")
    fun getAll(): Flow<List<Favourite>>

    @Query("SELECT * FROM favourite WHERE id LIKE :id LIMIT 1")
    fun findById(id: String): Flow<Favourite>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg favorites: Favourite)

    @Delete
    fun delete(user: Favourite)
}