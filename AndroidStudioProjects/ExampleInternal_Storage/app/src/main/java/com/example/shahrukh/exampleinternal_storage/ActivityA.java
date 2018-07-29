package com.example.shahrukh.exampleinternal_storage;

import android.content.Context;
import android.content.Intent;
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

    EditText nameA,passwordA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        nameA=(EditText)findViewById(R.id.name_id1);
        passwordA=(EditText)findViewById(R.id.password_id1);

    }
    public void Save(View view) throws IOException {

        File file=null;
        FileOutputStream fileOutputStream=null;
        file=getFilesDir();
        String name=nameA.getText().toString();
        String password=passwordA.getText().toString();
        fileOutputStream=openFileOutput("Code.txt", Context.MODE_PRIVATE);
        fileOutputStream.write(name.getBytes());
        fileOutputStream.write(password.getBytes());
        Toast.makeText(this,"File has ben saved"+"path"+file+"Code.txt",Toast.LENGTH_LONG).show();
        nameA.setText(" ");
        passwordA.setText(" ");

        fileOutputStream.close();



    }


    public  void Next(View view){

        Toast.makeText(this,"Go to the next Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);

    }
}
