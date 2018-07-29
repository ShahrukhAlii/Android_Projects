package com.example.a3teesystem.checkedbox;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


   CheckBox c;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(CheckBox) findViewById(R.id.editText);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CheckBox c=(CheckBox)v ;
        if(c.getId()==R.id.editText){


            Toast.makeText(this,"The Order you will get in 5 mints",Toast.LENGTH_LONG).show();

        }
        else
        {

            Toast.makeText(this,"See the menu and order again:",Toast.LENGTH_LONG).show();
        }
    }
}
