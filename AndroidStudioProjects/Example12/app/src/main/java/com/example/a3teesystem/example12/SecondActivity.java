package com.example.a3teesystem.example12;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();



    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();

        Toast.makeText(this,"On",Toast.LENGTH_SHORT).show();
    }

}
