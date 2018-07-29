package com.example.a3teesystem.togglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import static android.graphics.Color.BLACK;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    ToggleButton t;
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(ToggleButton)findViewById(R.id.toggleButton);
        r=(RelativeLayout)findViewById(R.id.layout);
        t.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){

            r.setBackgroundColor(Color.BLUE);

        }
        else if(isChecked){
            r.setBackgroundColor(Color.GREEN);
        }
        else if(isChecked){
            r.setBackgroundColor(Color.RED);

        }

    }
}
