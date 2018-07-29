package com.example.a3teesystem.sharedpreference;

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
        nameB =(EditText)findViewById(R.id.nameB);
        passwordB=(EditText)findViewById(R.id.passowrdB);
    }

    public void Load(View view){

        SharedPreferences sharedPreferences =getSharedPreferences("Mydata", Context.MODE_PRIVATE);
       String name= sharedPreferences.getString("name",DEFAULT);
        String  password= sharedPreferences.getString("password",DEFAULT);
        //Comparison between default
        if(name.equals(DEFAULT)||password.equals(DEFAULT)){

            Toast.makeText(this,"Thw value was not found",Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(this,"The value load Successfully",Toast.LENGTH_LONG).show();
            nameB.setText(name);
            passwordB.setText(password);

        }

    }

    public void Previous(View view){
        Toast.makeText(this,"previous",Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,ActivityA.class);
        startActivity(i);

    }
}
