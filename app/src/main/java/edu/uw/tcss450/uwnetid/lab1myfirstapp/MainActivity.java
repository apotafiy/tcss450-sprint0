package edu.uw.tcss450.uwnetid.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test","Test");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.w("start","start");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("resume","resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("debug","debug");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("stop","stop");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("error","error");
    }
}