package com.example.shahrukh.countdowm;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public int count;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new CountDownTimer(3000,1000) {

                    @Override
                    public void onTick(long millisUntilFinished) {

                        textView.setText(String.valueOf(count));
                        count++;
                    }

                    @Override
                    public void onFinish() {

                        textView.setText("Finish");

                    }

                }.start();
            }
        });

    }
}
