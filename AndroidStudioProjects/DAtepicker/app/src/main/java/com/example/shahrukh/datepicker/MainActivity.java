package com.example.shahrukh.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day="day"+datePicker.getDayOfMonth();
                String month="month"+(datePicker.getMonth()+1);
                String year="year"+datePicker.getYear();
                Toast.makeText(getApplicationContext(),day+ ": "+month +":"+ year,Toast.LENGTH_LONG).show();
            }
        });
    }
}
