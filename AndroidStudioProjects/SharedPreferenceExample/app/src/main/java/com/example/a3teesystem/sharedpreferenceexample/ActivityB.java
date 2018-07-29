package com.example.a3teesystem.sharedpreferenceexample;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB  extends AppCompatActivity{

    EditText nameB,passwordB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public  void Load(View view){


    }


    public  void Previous(View view){

        Toast.makeText(this,"Show the Previous Data",Toast.LENGTH_LONG).show();

        Intent intent =new Intent(this, Activit);


    }


}
