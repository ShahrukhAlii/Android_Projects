package com.example.shahrukh.chronometer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button start,stop,restart,setformat,clearformat;
    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.button);
        stop=(Button)findViewById(R.id.button2);
        restart=(Button)findViewById(R.id.button3);
        setformat=(Button)findViewById(R.id.button4);
        clearformat=(Button)findViewById(R.id.button5);
        chronometer=(Chronometer)findViewById(R.id.chronometer2);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chronometer.stop();
                    }
                });


                restart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chronometer.setBase(SystemClock.elapsedRealtime());
                    }
                });


                setformat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chronometer.setFormat("Time(%s)");
                    }
                });

                clearformat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        chronometer.setFormat(null);
                    }
                });
            }
        });
    }
}
