package com.classs.ioproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.CheckedOutputStream;

public class InternalStorageActivity extends AppCompatActivity {

    EditText textmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textmsg = (EditText) findViewById(R.id.editText1);
    }

    public void WriteBtn(View v) {
        try {
            FileOutputStream fileOutputStream = openFileOutput("Abc.txt", MODE_PRIVATE);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(textmsg.getText().toString());
            outputStreamWriter.close();
            Toast.makeText(InternalStorageActivity.this, "File Saved Succesfully", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(InternalStorageActivity.this, "Some Error Occured", Toast.LENGTH_SHORT).show();
        }
    }

    public void ReadBtn(View v) {
        try {
            FileInputStream fileInputStream = openFileInput("Abc.txt");
            InputStreamReader inputStreamReader  = new InputStreamReader(fileInputStream);
            char[] inputBuffer = new char[100];
            String s = "";
            int charRead;
            while ((charRead = inputStreamReader.read(inputBuffer)) > 0) {
                String message = String.copyValueOf(inputBuffer,0,charRead);//a,b,c
                s+=message;//abc
            }
            inputStreamReader.close();
            Toast.makeText(InternalStorageActivity.this, "Read Saved Succesfully", Toast.LENGTH_SHORT).show();
            textmsg.setText(s);

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(InternalStorageActivity.this, "Some Error Occured", Toast.LENGTH_SHORT).show();
        }
    }
}
