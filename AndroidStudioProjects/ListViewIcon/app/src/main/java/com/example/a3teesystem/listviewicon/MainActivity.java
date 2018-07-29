package com.example.a3teesystem.listviewicon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] data={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","satuarday"};
    ListView l;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.single_row,data);
        l.setAdapter(adapter);

    }
}
