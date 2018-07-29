package com.example.shahrukh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
   String coountryList[]={"Pakistan","China","USA","Canada","Iran","Iraq"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.listview,R.id.textView,coountryList);
        listView.setAdapter(arrayAdapter);
    }
}
