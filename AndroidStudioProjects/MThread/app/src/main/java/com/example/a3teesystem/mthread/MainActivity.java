package com.example.a3teesystem.mthread;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myText (){

        Runnable r= new Runnable() {
            @Override
            public void run() {
                long futureTime =System.currentTimeMillis()+5000;
                while (System.currentTimeMillis()<futureTime){
                    synchronized (this){
                        try {
                            wait(System.currentTimeMillis()-futureTime);
                        }
                        catch (Exception e){}

                    }



                }
            }
        };

        Thread myThread= new Thread(r);
        myThread.start();
    }
}
