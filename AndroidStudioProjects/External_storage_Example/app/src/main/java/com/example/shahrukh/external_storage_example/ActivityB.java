package com.example.shahrukh.external_storage_example;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ActivityB extends AppCompatActivity {
    EditText getdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        getdata=(EditText) findViewById(R.id.editText);
    }


    public  void ReadPrivate(View view) throws IOException {


        File folder=getExternalFilesDir("myText");
        File myFile=new File(folder,"myfile");
        String text=getdata(myFile);
      /*  if (text != null) {
            showText.setText(text);
        } else {
            showText.setText("No Data");
        }
*/
    }

    public  void ReadPublic(View view) throws IOException {

        File folder= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS);
        File myFile=new File(folder,"mytext");
        String text=getdata(myFile);

      /*  if (text != null) {
            showText.setText(text);
        } else {
            showText.setText("No Data");
        }
*/

    }

    private String getdata(File myFile) throws IOException {


        FileInputStream fileInputStream=null;
        fileInputStream=new FileInputStream(myFile);
        int read=-1;
        StringBuffer buffer=new StringBuffer();
        while((read=fileInputStream.read())!=-1){


            buffer.append((char)read);
            fileInputStream.close();

        }
        return null;
    }

    public  void Load(View view){

        Toast.makeText(this,"Load the Activity", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityA.class);
        startActivity(intent);
    }
}
