package edu.uw.tcss450.uwnetid.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // This is Katlyn's change!
    //Another change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("This is a test error","Test test test");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart(); // TODO does this need for stuff? should there be args?
        Log.w("This is a test warning","Testing for Kate!");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("This is test information","Testing!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("This is a test debug","Testing!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("This is a test verbose","Testing!");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("This is a test error","Test test test");
    }
}