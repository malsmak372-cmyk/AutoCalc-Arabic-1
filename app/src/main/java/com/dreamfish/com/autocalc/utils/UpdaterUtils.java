package com.dreamfish.com.autocalc.utils;

import android.app.Activity;
import android.widget.Toast;
import com.dreamfish.com.autocalc.R;

public class UpdaterUtils {
  private Activity activity;
  public UpdaterUtils(Activity activity) {
    this.activity = activity;
  }
  public static UpdaterUtils getInstance() {
    return null;
  }
  public void checkUpdate(boolean isAutoCheck) {
    if (!isAutoCheck) {
      Toast.makeText(activity, "أنت تستخدم أحدث إصدار", Toast.LENGTH_SHORT).show();
    }
  }
}
