package com.example.shahrukh.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {


    Button Save,Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Save=(Button)findViewById(R.id.button);
        Next=(Button)findViewById(R.id.button2);





    }
    public  void Save(View view){

        SharedPreferences sharedPreferences = getSharedPreferences("Mydata",MODE_PRIVATE);
        sharedPreferences.Editor editor =sharedPreferences.edit();
        sharedPreferences.


    }
}
