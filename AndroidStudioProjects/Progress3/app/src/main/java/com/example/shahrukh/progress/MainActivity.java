package com.example.shahrukh.progress;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Loading");
                progressDialog.setTitle("Progress Dialog");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();



                new Thread(new Runnable() {
                    @Override
                    public void run() {


                        try{

                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();

                        }
                        progressDialog.dismiss();


                    }

                }).start();
            }

        } );

        b2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setMax(100);
                progressDialog.setMessage("Loading");
                progressDialog.setTitle("Progress Dialog");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.show();


                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{

                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }).start();





            }
        });
    }
}
