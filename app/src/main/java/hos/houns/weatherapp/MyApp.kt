package hos.houns.weatherapp

import androidx.multidex.MultiDexApplication
import com.google.android.libraries.places.api.Places
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
class MyApp : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(modules)
        }
        Places.initialize(applicationContext, "AIzaSyDShLhHuGJ1Rmo5WTuNsi0Rgrd4XP5_GPs")
    }

    companion object{
         var appcolor :Int= android.R.color.white
    }
}