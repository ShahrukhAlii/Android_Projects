package com.example.a3teesystem.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    public static final String DEFAULT="N/A";

    EditText nameB,passwordB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        nameB=(EditText)findViewById(R.id.nameB);
        passwordB=(EditText)findViewById(R.id.PasswordB);
    }


    public void Load(View view){

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String namb1=sharedPreferences.getString("name",DEFAULT);
        String passwordb1=sharedPreferences.getString("password",DEFAULT);


        if(nameB.equals(DEFAULT)||passwordB.equals(DEFAULT)){

            Toast.makeText(this,"Data is not successfully saved",Toast.LENGTH_LONG).show();

        }
        else{

            Toast.makeText(this,"Data was successsfully saved",Toast.LENGTH_LONG).show();
            namb1.setText(nameB);
            passwordb1.setText(passwordB);

        }

    }


    public void Previous(View view){


        Toast.makeText(this,"Load the previoud data",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityA.class);
        startActivity(intent);


    }
}
