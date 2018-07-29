package com.example.shahrukh.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterViewFlipper;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    AdapterViewFlipper adapterViewFlipper;
    int Pimages[]={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.ln};
    String[] Pnames={"Image 1","Image 2","Image 3","Image 4","Image 5"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapterViewFlipper=(AdapterViewFlipper)findViewById(R.id.adapterSwitcher);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),Pnames,Pimages);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setAutoStart(true);

    }
}
