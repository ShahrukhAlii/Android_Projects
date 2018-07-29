package com.example.shahrukh.switch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Switch aSwitch,bSwitch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch=(Switch)findViewById(R.id.switch1);
        bSwitch=(Switch)findViewById(R.id.switch2);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String switch1,switch2;

                if(aSwitch.isChecked())
                switch1=aSwitch.getTextOn().toString();
                else
                    switch1=aSwitch.getTextOff().toString();

                if(bSwitch.isChecked())

                    switch2=bSwitch.getTextOn().toString();
                else
                    switch2=bSwitch.getTextOff().toString();

                Toast.makeText(getApplicationContext()," Switch 1 is on"+ aSwitch + "\n"+ " Switch B is on"+bSwitch,Toast.LENGTH_LONG).show();

            }
        });
    }
}
