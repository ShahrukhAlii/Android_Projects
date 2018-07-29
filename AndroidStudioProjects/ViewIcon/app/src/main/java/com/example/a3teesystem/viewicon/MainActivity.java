package com.example.a3teesystem.viewicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] data={"Monday","tuesday","Wednesday","Thursday","Friday","Satuarday","Sunday"};
    ListView l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.id.textView,data);
        l.setAdapter(adapter);
    }
}
