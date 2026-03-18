package com.example.s1q1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy()");
    }
}