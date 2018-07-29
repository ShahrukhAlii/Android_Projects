package com.example.a3teesystem.mydialoge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void MyDialog(View v){

MyAlert myAlert=new MyAlert();
myAlert.show(getFragmentManager(),"My Alert");

    }
}
