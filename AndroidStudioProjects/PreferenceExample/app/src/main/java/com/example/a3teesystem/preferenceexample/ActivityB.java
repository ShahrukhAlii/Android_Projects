package com.example.a3teesystem.preferenceexample;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    EditText nameb,passwordb;

    public static final String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        nameb=(EditText)findViewById(R.id.name2);
        passwordb=(EditText) findViewById(R.id.password2);

    }

    public void Load(View view){

SharedPreferences sharedPreferences=getSharedPreferences("MyData",Context.MODE_PRIVATE);
        String nameb1= sharedPreferences.getString("name",DEFAULT);
        String passwordb1=sharedPreferences.getString("password",DEFAULT);
        if(nameb.equals(DEFAULT)||passwordb.equals(DEFAULT)){

            Toast.makeText(this,"The data was not found",Toast.LENGTH_LONG).show();
        }
        else{

            Toast.makeText(this,"The data was load successfully",Toast.LENGTH_LONG).show();
            nameb.setText(nameb1);
            passwordb.setText(passwordb1);

        }




    }

    public void Previous(View view){

        Toast.makeText(this,"Previoud",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityA.class);
        startActivity(intent);

    }

}
