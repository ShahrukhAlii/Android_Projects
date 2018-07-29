package com.example.shahrukh.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Switch aSwitch ,bswitch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch=(Switch)findViewById(R.id.swicth2);
        bswitch=(Switch)findViewById(R.id.switch1);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String switcha,switchb;

              if(aSwitch.isChecked())
                  switcha=aSwitch.getTextOn().toString();

              else
                  switcha=aSwitch.getTextOff().toString();


              if(bswitch.isChecked())
                  switchb=bswitch.getTextOn().toString();

                          else
                              switchb=bswitch.getTextOff().toString();

                Toast.makeText(getApplicationContext(), "Switch1 :" + switcha + "\n" + "Switch2 :" + switchb, Toast.LENGTH_LONG).show(); // display the current state for switch's


            }
        });
    }
}
