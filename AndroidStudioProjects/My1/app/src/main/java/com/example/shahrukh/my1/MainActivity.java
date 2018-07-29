package com.example.shahrukh.my1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Switch aSwitch,bswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aSwitch=(Switch)findViewById(R.id.switch1);
        bswitch=(Switch)findViewById(R.id.switch2);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String switchStatusA,switchStatusB;
                if(aSwitch.isChecked())
                    switchStatusA=aSwitch.getTextOn().toString();
                else
                    switchStatusA=bswitch.getTextOff().toString();

                if(bswitch.isChecked())
                    switchStatusB=bswitch.getTextOn().toString();

                else
                    switchStatusB=bswitch.getTextOff().toString();
                Toast.makeText(getApplication(),"Switch A"+ switchStatusA +"\n"+ "switch B"+switchStatusB,Toast.LENGTH_LONG).show();


            }







        });
    }
}
