package com.example.a3teesystem.bio_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void OnClick(View view){

        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);


    }

}
