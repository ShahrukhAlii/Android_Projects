package com.example.a3teesystem.preferenceexample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    EditText name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        name= findViewById(R.id.name1);
        password= findViewById(R.id.password1);
    }



    public void Save(View view){


/*SharedPreferences sharedPreferences=getSharedPreferences("MyData",Context.MODE_PRIVATE);
  sharedPreferences.Editor editor=sharedPreferences.edit();
  editor.putString("Name sdata would be here",name.getText().toString());
  editor.putString("Password data would be here",passowrd.getText().toString());
  editor.commit();*/
        SharedPreferences sharedPreference = getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreference.edit();
        editor.putString("name",name.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.apply();





    }
    public void Next( View view){

        Toast.makeText(this,"Next",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);

    }
}
