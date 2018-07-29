package com.example.a3teesystem.sharedpreference2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB1 extends AppCompatActivity {
    public  static final String Default="N/A";

    EditText nameb,passwordB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);

        nameb=(EditText)findViewById(R.id.name_text);
        passwordB=(EditText)findViewById(R.id.password_text);
    }


    public void Load(View view){

        SharedPreferences sharedPreferences=getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name",Default);
        String password =sharedPreferences.getString("password",Default);

        if(name.equals(Default)||password.equals(Default)) {

            Toast.makeText(this, "The value was not found", Toast.LENGTH_LONG).show();
        }


    else {

            Toast.makeText(this, "Previous was successfully loaded", Toast.LENGTH_LONG).show();

           nameb.setText(name);
           passwordB.setText(password);
        }
    }

    public void Previous(View view){

        Toast.makeText(this,"Go into Previous section",Toast.LENGTH_LONG).show();
        Intent i =new Intent(this,ActivityA1.class);
        startActivity(i);

    }

}
