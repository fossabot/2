package hos.houns.weatherapp.localstore.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteDao {
    @Query("SELECT * FROM favorite")
    fun getAll(): Flow<List<Favorite>>

    @Query("SELECT * FROM favorite WHERE id LIKE :id LIMIT 1")
    fun findById(id: String): Flow<Favorite>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg favorites: Favorite)

    @Delete
    fun delete(user: Favorite)
}