package com.example.shahrukh.toggledbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button submit;
    ToggleButton button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(ToggleButton)findViewById(R.id.toggleButton);
        button2=(ToggleButton)findViewById(R.id.toglebutton);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // String status = "ToggleButton1 : " + simpleToggleButton1.getText() + "\n" + "ToggleButton2 : " + simpleToggleButton2.getText();
                String status="  ToggleButton 1 is Enable"+button1.getText()+"\n"+"Toggle Button 2 is Enable"+button2.getText();
                Toast.makeText(getApplicationContext(),status,Toast.LENGTH_LONG).show();


            }
        });

    }
}
