package hos.houns.weatherapp.device

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.CancellationTokenSource
import hos.houns.weatherapp.domain.entity.CurrentLocation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.lang.Exception

@SuppressLint("MissingPermission")
class LocationManager(
    private val context: Context
)  {

     suspend fun getCurrentLocation() = withContext(Dispatchers.IO) {
        val cancellationTokenSource = CancellationTokenSource()
        val currentLocationTask =  LocationServices.getFusedLocationProviderClient(context).getCurrentLocation(
            PRIORITY_HIGH_ACCURACY,
            cancellationTokenSource.token
        ).await()
        cancellationTokenSource.cancel()
        CurrentLocation(currentLocationTask.latitude, currentLocationTask.longitude)
    }

    @SuppressLint("ServiceCast")
      fun isLocationEnabled(): Boolean {
        val lm = context.getSystemService(Context.LOCATION_SERVICE) as android.location.LocationManager
        var gps_enabled = false
        var network_enabled = false
        try {
            gps_enabled = lm.isProviderEnabled(android.location.LocationManager.GPS_PROVIDER)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        try {
            network_enabled = lm.isProviderEnabled(android.location.LocationManager.NETWORK_PROVIDER)
        } catch (e: Exception) {
            e.printStackTrace()
        }

       return gps_enabled && network_enabled
    }

     fun hasFinePermissionGranted(): Boolean {
        // Background permissions didn't exit prior to Q, so it's approved by default.
        if (Manifest.permission.ACCESS_FINE_LOCATION == Manifest.permission.ACCESS_BACKGROUND_LOCATION &&
            android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.Q) {
            return true
        }

        return ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED
    }

}