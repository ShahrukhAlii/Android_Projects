package com.example.shahrukh.n1;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start,stop,restart,setFormat,ClearFOrmat;
    Chronometer chronometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.button);
        stop=(Button)findViewById(R.id.button2);
        restart=(Button)findViewById(R.id.button3);
        setFormat=(Button)findViewById(R.id.button4);
        ClearFOrmat=(Button)findViewById(R.id.button5);




    }

    @Override
    public void onClick(View v) {
        chronometer.start();
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.setFormat("Time (%s)");
        chronometer.setFormat(null);
    }
}
