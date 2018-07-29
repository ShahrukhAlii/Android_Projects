package com.example.a3teesystem.inflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] data={"Sunday","Monday","Tuesady","Wednesday","Thursday","Friday","Saturday"};
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.second_file,R.id.textView,data);
        l.setAdapter(adapter);
    }
    

}
