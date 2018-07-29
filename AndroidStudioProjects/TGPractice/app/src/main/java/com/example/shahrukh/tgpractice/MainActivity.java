package com.example.shahrukh.tgpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {



ToggleButton toggleButton,toggleButton2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2=(ToggleButton)findViewById(R.id.toggleButton1);
        button=(Button)findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   String status;
               // Toast.makeText(getApplicationContext(),"ToggleButton 1"+toggleButton+"\n"+ "oggleButton 2 "+toggleButton2,Toast.LENGTH_LONG).show();

                String status="Toggle Button 1"+toggleButton+"\n"+"Toggle Button 2"+toggleButton2.getText();
                Toast.makeText(getApplicationContext(),status,Toast.LENGTH_LONG).show();


            }
        });
    }
}
