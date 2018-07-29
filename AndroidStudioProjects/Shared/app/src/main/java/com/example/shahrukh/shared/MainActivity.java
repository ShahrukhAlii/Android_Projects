package com.example.shahrukh.shared;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button save,next;
    EditText name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);





    }


    public void Save(View view){

        SharedPreferences sharedPreferences=getSharedPreferences("mydata",MODE_PRIVATE);
        sharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",name.getText().toString());
        editor.putString("Password",password.getText().toString());
        editor.apply();

    }
}
