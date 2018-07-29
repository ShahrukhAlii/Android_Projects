package com.example.shahrukh.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SecondActivity  extends AppCompatActivity{


               Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondButton=(Button)findViewById(R.id.button2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


      //  Toast.makeText(getApplicationContext(),"Second Activity",Toast.LENGTH_LONG).show();

    }
}
