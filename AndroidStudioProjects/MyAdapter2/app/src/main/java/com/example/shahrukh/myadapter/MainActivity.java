package com.example.shahrukh.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String country[]={"Pakistan","Pakpatan","China","Japan","Iraq","Iran","Afganistan","India","USA","Canada","France","Maxico","Australia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.listview,R.id.textView,country);
        simplelist.setAdapter(arrayAdapter);

    }
}
