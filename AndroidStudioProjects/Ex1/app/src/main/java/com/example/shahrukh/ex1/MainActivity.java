package com.example.shahrukh.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    String days[]={"Monday","Tuesday","Thursday","Wednesday","Friday","Satuarday","Sunday"};
    int[] Images ={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i5,R.drawable.i7,R.drawable.i8};
    CustomAdapter customAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),Images,days);
        listView.setAdapter(customAdapter);



    }
}
