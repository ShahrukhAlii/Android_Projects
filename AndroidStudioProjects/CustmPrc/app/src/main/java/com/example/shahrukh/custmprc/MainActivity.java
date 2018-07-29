package com.example.shahrukh.custmprc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simplelist;
    String Dname[]={"Dog1","Dog2","Dog3","Dog4","Dog5","Dog6","Dog7","Dog8"};
    int Dpics[]={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),Dname,Dpics);
        simplelist.setAdapter(customAdapter);
    }
}
