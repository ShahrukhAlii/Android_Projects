package com.example.shahrukh.day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    DatePicker datePicker;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=(Button)findViewById(R.id.button);
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day="Day"+datePicker.getDayOfMonth();
                String  month="Month"+(datePicker.getMonth()+1);
                String year="Year"+datePicker.getYear();
                Toast.makeText(getApplication(),day+"\n"+month+"\n"+year,Toast.LENGTH_LONG).show();
            }
        });
    }
}
