package com.example.shahrukh.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Entries extends AppCompatActivity {

    EditText fullName,phone,email,postalcode;
    Spinner spinner;
    Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        fullName=(EditText)findViewById(R.id.fullname);
        phone=(EditText)findViewById(R.id.phone);
        email=(EditText)findViewById(R.id.email);
        postalcode=(EditText)findViewById(R.id.postalcode);
        submit=(Button)findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Entries.this,MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Message has been submitted",Toast.LENGTH_LONG).show();
            }
        });


    }
}
