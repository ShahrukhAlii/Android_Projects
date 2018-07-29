package com.example.shahrukh.exampleinternal_storage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ActivityB extends AppCompatActivity {

    EditText getname,getpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        getname=(EditText)findViewById(R.id.name_id1);
        getpass=(EditText)findViewById(R.id.password_id2);
    }

    public void Load(View view) throws IOException {

        FileInputStream fileInputStream=openFileInput("Code.txt");
        int read=-1;
        StringBuffer buffer=new StringBuffer();
        while ((read=fileInputStream.read())!=-1){

            buffer.append((char)read);
        }
        String name=buffer.substring(0,buffer.indexOf(" "));
        String pass=buffer.substring(buffer.indexOf(" "));
        Toast.makeText(this,"Open the previous file",Toast.LENGTH_LONG).show();

    }

    public  void Previoud (View view){

        Toast.makeText(this,"Load the Previous Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityA.class);
        startActivity(intent);



    }

}
