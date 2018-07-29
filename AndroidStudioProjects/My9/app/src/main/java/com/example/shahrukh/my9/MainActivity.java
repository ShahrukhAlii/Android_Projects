package com.example.shahrukh.my9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        time=(TextView)findViewById(R.id.textView);
        timePicker=(TimePicker)findViewById(R.id.timePicker);


        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplication(),hourOfDay+" "+minute,Toast.LENGTH_LONG).show();
                time.setText("Time is"+hourOfDay+ ":" +minute );
            }
        });
    }
}
