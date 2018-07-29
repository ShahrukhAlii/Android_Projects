package com.example.a3teesystem.thread;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            TextView mytexts = (TextView) findViewById(R.id.myTextid);
            mytexts.setText("This is new text");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mytext(final View view) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

                long futureTime = System.currentTimeMillis() + 50000;
                while (System.currentTimeMillis() < futureTime) {


                    synchronized (this) {
                        try {
                            wait(futureTime - System.currentTimeMillis());
                        } catch (Exception e) {
                        }
                    }



                }

                handler.sendEmptyMessageAtTime(1,0);
                //  TextView mytexts =(TextView)findViewById(R.id.myTextid);
                //      mytexts.setText("This is new text");
            }
        };

Thread myThread =new Thread(r);
myThread.start();

    }}