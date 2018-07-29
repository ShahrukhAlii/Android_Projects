package com.example.a3teesystem.sharedpreference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity{
    EditText name;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);


    }
    public void Save(View view){

        SharedPreferences sharedPreference = getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreference.edit();
        editor.putString("name",name.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.commit();

        Toast.makeText(this,"Data was saved successfully",Toast.LENGTH_LONG).show();

    }

    public void Next(View view){

        Toast.makeText(this,"Next",Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,ActivityB.class);
        startActivity(i);

    }


}
