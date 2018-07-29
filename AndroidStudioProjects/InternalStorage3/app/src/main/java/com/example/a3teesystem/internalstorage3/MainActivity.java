package com.example.a3teesystem.internalstorage3;

import android.content.Context;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {


    EditText nameA,passwordA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameA=(EditText)findViewById(R.id.nameid);
        passwordA=(EditText)findViewById(R.id.passwordid);

    }

    public  void Save(View view) throws IOException {

        File file=null;

        String namea= nameA.getText().toString();
        String passwordb=passwordA.getText().toString();
        FileOutputStream fileOutputStream=null;
        namea=namea+" ";
        file=getFilesDir();
        fileOutputStream=openFileOutput("Code.txt", Context.MODE_PRIVATE);
        fileOutputStream.write(namea.getBytes());
        fileOutputStream.write(passwordb.getBytes());
        Toast.makeText(this ,"File is saved"+"Path"+file+"COde.txt",Toast.LENGTH_LONG).show();
        nameA.setText(" ");
        passwordA.setText(" ");
        fileOutputStream.close();


    }


    public void Next(View view){

        Toast.makeText(this,"Go to the next Activity",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);



    }
}
