package com.example.a3teesystem.bio_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void saySomeThing(View view){

        Intent i =new Intent(this,ThirdActivity.class);
        i.putExtra("Messgae","Have to go in Thirf Acivity");
        startActivity(i);
    }
}
