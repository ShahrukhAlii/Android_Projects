package com.example.shahrukh.logcat;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private static final String MainActivity= MainActivity.class.getSimpleName();


    private void showLog(String text){

        Log.d(MainActivity, text);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {

        showLog("Activity Created");



    }


    @Override
    protected void onStart() {
        super.onStart();

        showLog("Activity Start");

    }


    @Override
    protected void onResume() {
        super.onResume();

        showLog("Activity Resume");

    }


    @Override
    protected void onPause() {
        super.onPause();

        showLog("Activity Pause");

    }

    @Override
    protected void onStop() {
        super.onStop();

        showLog("Activity Stop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showLog("Activity Restart");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        showLog("Activity Destroy");

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}