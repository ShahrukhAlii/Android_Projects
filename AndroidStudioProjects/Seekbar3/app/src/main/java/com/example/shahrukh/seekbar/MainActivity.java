package com.example.shahrukh.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    Button Submit;
    SeekBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit=(Button)findViewById(R.id.button);
        seekBar=(SeekBar)findViewById(R.id.seekBar2);
        bar=(SeekBar)findViewById(R.id.seekBar3);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progressValue=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this,"This is progressalue"+progressValue,Toast.LENGTH_LONG).show();


            }
        });
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int changevalue=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                changevalue=progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"This is from Seekbar descrete"+changevalue,Toast.LENGTH_LONG).show();

            }
        });


    }
}
