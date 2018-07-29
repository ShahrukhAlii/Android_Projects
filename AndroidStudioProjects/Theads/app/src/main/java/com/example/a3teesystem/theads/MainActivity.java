package com.example.a3teesystem.theads;

import android.os.Handler;
import android.os.Message;
import android.support.v4.util.Pools;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            TextView myText =(TextView)findViewById(R.id.textId);
            myText.setText("This is new Text");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickbutton(View view) {

        Runnable r = new Runnable() {
            @Override
            public void run() {


                long futureTime = System.currentTimeMillis() + 10000;
                while (System.currentTimeMillis() < futureTime) {

                    synchronized (this) {
                        try {
                            wait(futureTime - System.currentTimeMillis());

                        } catch (Exception e) {
                        }
                    }

handler.sendEmptyMessageAtTime(1,0);

                }


            }


        };

        Thread myThreads =new Thread(r);
        myThreads.start();


      //      TextView myText = (TextView) findViewById(R.id.textId);
        //    myText.setText("Gud job");

        }

    }


