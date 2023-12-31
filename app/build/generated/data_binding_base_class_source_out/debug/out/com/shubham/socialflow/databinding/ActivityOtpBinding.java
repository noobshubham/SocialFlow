// Generated by view binder compiler. Do not edit!
package com.shubham.socialflow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.shubham.socialflow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOtpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final EditText otpEditText1;

  @NonNull
  public final EditText otpEditText2;

  @NonNull
  public final EditText otpEditText3;

  @NonNull
  public final EditText otpEditText4;

  @NonNull
  public final EditText otpEditText5;

  @NonNull
  public final EditText otpEditText6;

  @NonNull
  public final Button verifyOTPBtn;

  private ActivityOtpBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline4,
      @NonNull Guideline guideline5, @NonNull ImageView imageView2, @NonNull EditText otpEditText1,
      @NonNull EditText otpEditText2, @NonNull EditText otpEditText3,
      @NonNull EditText otpEditText4, @NonNull EditText otpEditText5,
      @NonNull EditText otpEditText6, @NonNull Button verifyOTPBtn) {
    this.rootView = rootView;
    this.guideline4 = guideline4;
    this.guideline5 = guideline5;
    this.imageView2 = imageView2;
    this.otpEditText1 = otpEditText1;
    this.otpEditText2 = otpEditText2;
    this.otpEditText3 = otpEditText3;
    this.otpEditText4 = otpEditText4;
    this.otpEditText5 = otpEditText5;
    this.otpEditText6 = otpEditText6;
    this.verifyOTPBtn = verifyOTPBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_otp, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOtpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline4;
      Guideline guideline4 = ViewBindings.findChildViewById(rootView, id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.otpEditText1;
      EditText otpEditText1 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText1 == null) {
        break missingId;
      }

      id = R.id.otpEditText2;
      EditText otpEditText2 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText2 == null) {
        break missingId;
      }

      id = R.id.otpEditText3;
      EditText otpEditText3 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText3 == null) {
        break missingId;
      }

      id = R.id.otpEditText4;
      EditText otpEditText4 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText4 == null) {
        break missingId;
      }

      id = R.id.otpEditText5;
      EditText otpEditText5 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText5 == null) {
        break missingId;
      }

      id = R.id.otpEditText6;
      EditText otpEditText6 = ViewBindings.findChildViewById(rootView, id);
      if (otpEditText6 == null) {
        break missingId;
      }

      id = R.id.verifyOTPBtn;
      Button verifyOTPBtn = ViewBindings.findChildViewById(rootView, id);
      if (verifyOTPBtn == null) {
        break missingId;
      }

      return new ActivityOtpBinding((ConstraintLayout) rootView, guideline4, guideline5, imageView2,
          otpEditText1, otpEditText2, otpEditText3, otpEditText4, otpEditText5, otpEditText6,
          verifyOTPBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
