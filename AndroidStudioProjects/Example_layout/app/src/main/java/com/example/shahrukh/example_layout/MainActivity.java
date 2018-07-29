package com.example.shahrukh.example_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
     Button logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userName=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);
        logIn=(Button) findViewById(R.id.LogIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"The Button is clicked bu tyhe user",Toast.LENGTH_LONG).show();
            }
        });


    }
}
