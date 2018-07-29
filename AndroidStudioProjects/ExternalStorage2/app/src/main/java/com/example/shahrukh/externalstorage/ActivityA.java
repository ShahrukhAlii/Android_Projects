package com.example.shahrukh.externalstorage;

import android.Manifest;
import android.app.usage.StorageStatsManager;
import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PublicKey;

public class ActivityA extends AppCompatActivity {

    EditText data;
    private int STORAGE_PERMISSON_CODE=23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        data=(EditText)findViewById(R.id.editText);
    }
    public void SavePrivate(View view) throws IOException {

        String info=data.getText().toString();
        File folder=getExternalFilesDir("MyFile");
        File myfile=new File(folder,"myText.txt");
        writedata(myfile,info);
        data.setText(" ");


    }

    public void SavePublic(View view) throws IOException {

//storagre service code used in this line
         ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSON_CODE);

         String info=data.getText().toString();
        File folder= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS);
        File myFile=new File(folder,"myText.txt");
        writedata(myFile,info);
        data.setText(" ");

    }

    private void writedata(File myFile, String info) throws IOException {

        FileOutputStream fileOutputStream=null;
        fileOutputStream=new  FileOutputStream(myFile);
        fileOutputStream.write(info.getBytes());
        Toast.makeText(this,"Done"+myFile.getAbsolutePath(),Toast.LENGTH_LONG).show();

        fileOutputStream.close();

    }


    public void Next(View view){

        Toast.makeText(this,"Data has been save",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);

    }
}
