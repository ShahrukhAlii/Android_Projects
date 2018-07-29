package com.example.a3teesystem.internal_storage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ActivityA2 extends AppCompatActivity {
    EditText name,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
    }

    public void Save(View view) throws IOException {

        String Text1=name.getText().toString();
        String Text2=password.getText().toString();

        Text1=Text1+" ";
        FileOutputStream fos=openFileOutput("Example.txt", Context.MODE_PRIVATE);
        fos.write(Text1.getBytes());
        fos.write(Text2.getBytes());
        fos.close();


        Toast.makeText(this,"File has been successfully saved",Toast.LENGTH_LONG).show();

    }

    public void Back(View view){
        Toast.makeText(this,"Called Next",Toast.LENGTH_LONG).show();

        Intent i=new Intent(this,ActivityB2.class);
        startActivity(i);

    }

}
