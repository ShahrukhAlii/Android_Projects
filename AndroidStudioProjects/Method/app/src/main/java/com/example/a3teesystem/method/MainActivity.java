package com.example.a3teesystem.method;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void saySomething(View v){

        if(v.getId()==R.id.button) {
            Log.d("Data",   "The Button" +
                    "First was  clicked");
        }
        else if(v.getId()==R.id.button2) {

            Log.d("Data","Second button was clicked");

        }    }

}
