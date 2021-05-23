// Generated by view binder compiler. Do not edit!
package hos.houns.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import hos.houns.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ForecastItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout currentTempDetail;

  @NonNull
  public final AppCompatTextView day;

  @NonNull
  public final AppCompatImageView image;

  @NonNull
  public final AppCompatTextView temp;

  private ForecastItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout currentTempDetail, @NonNull AppCompatTextView day,
      @NonNull AppCompatImageView image, @NonNull AppCompatTextView temp) {
    this.rootView = rootView;
    this.currentTempDetail = currentTempDetail;
    this.day = day;
    this.image = image;
    this.temp = temp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ForecastItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ForecastItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.forecast_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ForecastItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout currentTempDetail = (ConstraintLayout) rootView;

      id = R.id.day;
      AppCompatTextView day = rootView.findViewById(id);
      if (day == null) {
        break missingId;
      }

      id = R.id.image;
      AppCompatImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.temp;
      AppCompatTextView temp = rootView.findViewById(id);
      if (temp == null) {
        break missingId;
      }

      return new ForecastItemBinding((ConstraintLayout) rootView, currentTempDetail, day, image,
          temp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
