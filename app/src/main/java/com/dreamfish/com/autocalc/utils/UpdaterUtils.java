package com.dreamfish.com.autocalc.utils;

import android.app.Activity;
import android.widget.Toast;
import com.dreamfish.com.autocalc.R;

public class UpdaterUtils {
    private Activity activity;
    private static UpdaterUtils instance;

    public UpdaterUtils(Activity activity) {
        this.activity = activity;
        instance = this;
    }

    public static UpdaterUtils getInstance() {
        return instance;
    }

    public void checkUpdate(boolean isAutoCheck) {
        if (activity == null) return;
        if (!isAutoCheck) {
            Toast.makeText(activity, "أنت تستخدم أحدث إصدار", Toast.LENGTH_SHORT).show();
        }
    }

    public void askForUpdate() {
        if (activity == null) return;
        Toast.makeText(activity, "التحقق من التحديثات...", Toast.LENGTH_SHORT).show();
    }
}
