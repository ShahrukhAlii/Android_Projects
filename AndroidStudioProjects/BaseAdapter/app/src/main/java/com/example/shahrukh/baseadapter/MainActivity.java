package com.example.shahrukh.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

GridView gridView;

int animal[]={R.drawable.i1,R.drawable.i2,R.drawable.i4,R.drawable.i3,R.drawable.i5};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),animal);
        gridView.setAdapter(customAdapter);
    }
}
