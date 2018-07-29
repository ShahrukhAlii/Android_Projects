package com.example.shahrukh.prc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;


    String dogsName[]={"Dog1","Dog2","Dog3","Dog4","Dog5"};
    int Dpis[]={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist=(ListView)findViewById(R.id.listview);
        CustomAdapter  adapter =new CustomAdapter(getApplicationContext(),dogsName,Dpis);
        simplelist.setAdapter(adapter);
    }
}
