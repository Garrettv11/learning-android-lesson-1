package com.example.gkim.lesson1;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {
    public static final String TAG = SplashActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.i(TAG, "gkim - onCreate getting called!");

        Intent launchLoginActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(launchLoginActivityIntent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "gkim - onResume getting called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "gkim - onPause getting called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "gkim - onStop getting called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "gkim - onDestroy getting called!");
    }
}
