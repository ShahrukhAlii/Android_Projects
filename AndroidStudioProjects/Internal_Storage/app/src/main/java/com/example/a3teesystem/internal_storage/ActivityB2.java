package com.example.a3teesystem.internal_storage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ActivityB2 extends AppCompatActivity {

    EditText nameB,passwordB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);
        nameB=(EditText)findViewById(R.id.name);
        passwordB=(EditText)findViewById(R.id.password);
    }
    public void Load(View view) throws IOException {

        FileInputStream fis=openFileInput("Example.txt");
        StringBuffer buffer=new StringBuffer();
        int read=-1;
         while ((read=fis.read())!=-1){

             buffer.append((char)read);

         }

        Log.d("Example",buffer.toString());
         String Text1=buffer.substring(buffer.indexOf(" "));
         String Text2=buffer.substring((buffer.indexOf(" ")+1));
         nameB.setText(Text1);
         passwordB.setText(Text2);

        Toast.makeText(this,"Successfully loaded",Toast.LENGTH_LONG).show();

    }

    public void Previous(View view){

         Toast.makeText(this,"Previous Activity",Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,ActivityA2.class);
        startActivity(i);
    }

}
