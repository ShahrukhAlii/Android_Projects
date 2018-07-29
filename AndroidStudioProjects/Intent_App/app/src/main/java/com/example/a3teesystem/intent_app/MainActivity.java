package com.example.a3teesystem.intent_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }






    public void onClick(View view) {
        Intent i = new Intent(this,bacon.class);

       final EditText appleid= (EditText)findViewById(R.id.appledata);

       String usermessage = appleid.getText().toString();
        i.putExtra("apple Message",usermessage);
        startActivity(i);

    }


    }


