package com.example.a3teesystem.sharedpreference2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA1 extends AppCompatActivity {
    EditText name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        name=(EditText)findViewById(R.id.name_text);
        password=(EditText)findViewById(R.id.password_text);
    }
    public void Save(View view){

        SharedPreferences sharedPreferences =getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("name",name.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.commit();

        Toast.makeText(this,"Data is saved successfully",Toast.LENGTH_LONG).show();
    }
    public  void next(View view){

        Intent i  =new Intent(this,ActivityB1.class);
        startActivity(i);


    }
}
