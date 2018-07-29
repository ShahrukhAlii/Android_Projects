package com.example.a3teesystem.internalstorage3;

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

public class ActivityB extends AppCompatActivity {


    EditText nameB,passwordB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        nameB=(EditText)findViewById(R.id.nameB);
        passwordB=(EditText)findViewById(R.id.passwordB);
    }



    public  void Load(View view) throws IOException {


        FileInputStream fileInputStream=openFileInput("Code.txt");
        int read=-1;
        StringBuffer stringBuffer=new StringBuffer();
        while((read=fileInputStream.read())!=-1){

            stringBuffer.append((char)read);
        }
        Log.d("Code",stringBuffer.toString());
        String nam=stringBuffer.substring(0,stringBuffer.indexOf(" "));
        String pass=stringBuffer.substring(stringBuffer.indexOf(" "+1));
        nameB.setText(" ");
        passwordB.setText(" ");

        Toast.makeText(this,"File has been loaded",Toast.LENGTH_LONG).show();


    }


    public void Previous(View view){

        Toast.makeText(this,"Go to the next Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);



    }



}
