package com.example.shahrukh.my2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button submit;
    ToggleButton toggleButtonA,toggleButtonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButtonA=(ToggleButton)findViewById(R.id.toggleButton);
        toggleButtonB=(ToggleButton)findViewById(R.id.toggleButton2);
        submit=(Button)findViewById(R.id.button);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String  status ="Toggle Button  1 Text "+ toggleButtonA.getText()+"\n"+"Toggle button 2 Text"+toggleButtonB.getText();

                Toast.makeText(getApplication(), status,Toast.LENGTH_LONG).show();


            }
        });
    }
}
