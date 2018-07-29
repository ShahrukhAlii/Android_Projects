package com.example.shahrukh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simplelist;
    String Name[]={"Name1","Name2","Name3","Name4","Name5","Name6","Name7","Name8"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simplelist=(ListView)findViewById(R.id.listview);
        ArrayAdapter adapter  = new  ArrayAdapter (this,R.layout.simple_list,R.id.textView,Name);

        simplelist.setAdapter(adapter);
    }
}
