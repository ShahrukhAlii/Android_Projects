package com.example.shahrukh.anadigiclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AnalogClock analogClock;
    DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock=(AnalogClock)findViewById(R.id.analog);
        digitalClock=(DigitalClock)findViewById(R.id.digital);

        analogClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Analog Clock",Toast.LENGTH_LONG).show();
            }
        });
        digitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Digital Clock",Toast.LENGTH_LONG).show();
            }
        });
    }
}
