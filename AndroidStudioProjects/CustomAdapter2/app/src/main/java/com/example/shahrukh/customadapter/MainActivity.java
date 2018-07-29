package com.example.shahrukh.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    int dogs[]={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7};
    String name[]={"Harami","Puppi","Kubbi","Jappi","Jumman","Jamalii","Wahabii"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),name,dogs);
        simpleList.setAdapter(customAdapter);

    }
}
