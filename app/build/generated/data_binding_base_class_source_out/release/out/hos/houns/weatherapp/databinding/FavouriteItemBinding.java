// Generated by view binder compiler. Do not edit!
package hos.houns.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import hos.houns.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FavouriteItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView favourite;

  private FavouriteItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView favourite) {
    this.rootView = rootView;
    this.favourite = favourite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FavouriteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FavouriteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.favourite_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FavouriteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.favourite;
      AppCompatTextView favourite = rootView.findViewById(id);
      if (favourite == null) {
        break missingId;
      }

      return new FavouriteItemBinding((ConstraintLayout) rootView, favourite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
