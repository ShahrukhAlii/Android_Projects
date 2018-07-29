package com.example.shahrukh.external_storage_example;

import android.Manifest;
import android.content.Intent;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ActivityA extends AppCompatActivity {

    EditText editText;
    private int STORAGE_PERMISSION_CODE=23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        editText=(EditText)findViewById(R.id.editText);

    }
    public  void SavePublic(View view) throws IOException {

        ActivityCompat.requestPermissions(this,new  String[]{Manifest.permission.READ_EXTERNAL_STORAGE},STORAGE_PERMISSION_CODE );

        String info=editText.getText().toString();
        File folder= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS);

        File myFile= new File(folder,"myText.txt");
        writeData(myFile,info);

    }

    private void writeData(File myFile, String info) throws IOException {

        FileOutputStream fileOutputStream=null;
        fileOutputStream=new FileOutputStream(myFile);
        fileOutputStream.write(info.getBytes());
        Toast.makeText(this,"Done"+myFile.getAbsolutePath(),Toast.LENGTH_LONG).show();

    }

    public  void SavePrivate(View view) throws IOException {


        String info=editText.getText().toString();
        File folder=getExternalFilesDir("mytext.txt");
        File myFile=new File(folder,"mytext.txt");
        writeData(myFile,info);


    }

    public void Next(View view){

        Toast.makeText(this,"Go to another Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);


    }

}
