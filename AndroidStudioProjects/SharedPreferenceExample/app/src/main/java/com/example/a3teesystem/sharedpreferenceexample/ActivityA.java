package com.example.a3teesystem.sharedpreferenceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class MainActivity extends AppCompatActivity {

    EditText nameA,passwordA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameA=(EditText)findViewById(R.id.nameA);
        passwordA=(EditText) findViewById(R.id.passwordA);

    }

    public  void Save(View view){



    }


    public void Next(View view){


        Toast.makeText(this,"Go to another activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent();
        startActivity(intent);

    }

}
