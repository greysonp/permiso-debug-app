package com.greysonparrelli.myapplication;

import android.os.Bundle;
import android.util.Log;

import com.greysonparrelli.permiso.PermisoActivity;

public class MainActivity extends PermisoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.fragment_container, new MainFragment()).commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause()");
    }
}
