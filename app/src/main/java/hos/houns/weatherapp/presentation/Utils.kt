package hos.houns.weatherapp.presentation

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

const val FavouriteUiModelID="FavouriteUiModelID"
const val FavouriteUiModelTitle="FavouriteUiModelTitle"
const val FavouriteUiModelLat="FavouriteUiModelLat"
const val FavouriteUiModelLong="FavouriteUiModelLong"
fun Fragment.requestPermissionWithRationale(
    permission: String,
    requestCode: Int,
    snackbar: AlertDialog.Builder
) {
    val provideRationale = shouldShowRequestPermissionRationale(permission)

    if (provideRationale) {
        snackbar.show()
    } else {
        requestPermissions(arrayOf(permission), requestCode)
    }
}



