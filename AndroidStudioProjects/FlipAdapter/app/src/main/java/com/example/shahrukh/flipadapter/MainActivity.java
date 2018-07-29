package com.example.shahrukh.flipadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    AdapterViewFlipper adapterViewFlipper;
    String[] Pnames={"Paharii 1","Paharii 2","Paharii 3","Paharii 4","Paharii 5"};
    int images[]={R.drawable.ln,R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapterViewFlipper=(AdapterViewFlipper)findViewById(R.id.adapterViewFlipper);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),Pnames,images);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setAutoStart(true);


    }
}
