package com.example.shahrukh.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton  b1,b2,b3,b4;
    Button button;
    String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.radio1);
        b2=(RadioButton)findViewById(R.id.radio2);
        b3=(RadioButton)findViewById(R.id.radio3);
        b4=(RadioButton)findViewById(R.id.radio4);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.isChecked()) {
                    status = b1.getText().toString();
                }

                else    if(b2.isChecked()) {
                    status = b2.getText().toString();

                }

                else    if(b3.isChecked()) {
                    status = b3.getText().toString();
                }

                else    if(b4.isChecked()) {
                    status = b4.getText().toString();
                }
                Toast.makeText(getApplicationContext(),status,Toast.LENGTH_LONG).show();

            }
        });

    }
}
