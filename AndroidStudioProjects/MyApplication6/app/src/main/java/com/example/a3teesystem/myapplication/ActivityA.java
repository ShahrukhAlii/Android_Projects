package com.example.a3teesystem.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    EditText nameA,passwordA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        nameA=(EditText)findViewById(R.id.nameA);
        passwordA=(EditText)findViewById(R.id.passwordA);
    }


    public  void Save(View view){


        SharedPreferences sharedPreferences=getSharedPreferences("MyData", Context.MODE_PRIVATE);
        sharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("name",nameA.getText().toString());
        editor.putString("password",passwordA.getText().toString());
        editor.apply();


    }


    public void Next(View view){

        Toast.makeText(this,"Go to another activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);



    }



}
