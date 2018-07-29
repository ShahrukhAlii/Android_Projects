package com.example.shahrukh.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch switch1,switch2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1=(Switch)findViewById(R.id.switch2);
        switch2=(Switch)findViewById(R.id.switch3);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String switchA,switchB;

                if(switch1.isChecked())
                    switchA=switch1.getTextOn().toString();
                else
                    switchA=switch1.getTextOff().toString();



                if(switch2.isChecked())
                    switchB=switch2.getTextOn().toString();
                else
                    switchB=switch2.getTextOff().toString();


                Toast.makeText(getApplicationContext(),"Switch A is pressed"+switchA+"\n"+"Switch B is pressed"+switchB,Toast.LENGTH_LONG).show();

            }
        });
    }
}
