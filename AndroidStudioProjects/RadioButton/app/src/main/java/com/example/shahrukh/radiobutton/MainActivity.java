package com.example.shahrukh.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton Johnbhaii, Shemus,RandyOrtan,Cezaro,Steve;
    Button button;
    String select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Johnbhaii=(RadioButton)findViewById(R.id.radioButton);
        Shemus=(RadioButton)findViewById(R.id.radioButton5);
        RandyOrtan=(RadioButton)findViewById(R.id.radioButton4);
        Cezaro=(RadioButton)findViewById(R.id.radioButton3);
        Steve=(RadioButton)findViewById(R.id.radioButton2);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Johnbhaii.isChecked()) {
                    select = Johnbhaii.getText().toString();
                } else if (Shemus.isChecked()) {
                    select = Shemus.getText().toString();

                }

                else if(RandyOrtan.isChecked()){

                    select=RandyOrtan.getText().toString();
                }
                else if(Cezaro.isChecked()){
                    select=Cezaro.getText().toString();
                }
                else if(Steve.isChecked()){select=Steve.getText().toString();
                }
                Toast.makeText(getApplicationContext(),select,Toast.LENGTH_LONG).show();
            }
        });



    }
}
