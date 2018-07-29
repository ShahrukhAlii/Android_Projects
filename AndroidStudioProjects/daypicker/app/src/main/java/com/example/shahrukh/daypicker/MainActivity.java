package com.example.shahrukh.daypicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day="Day"+datePicker.getDayOfMonth();
                String Month="Month"+(datePicker.getMonth()+1);
                String  year="Year"+datePicker.getYear();

                Toast.makeText(getApplicationContext(),day+ "\n"+Month+" \n" + year,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
