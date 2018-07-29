package com.example.shahrukh.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


@SuppressLint("Registered")
public class SecondActivity extends AppCompatActivity{


    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });


        Toast.makeText(getApplicationContext(),"This is from second Activity",Toast.LENGTH_LONG).show();


    }
}
