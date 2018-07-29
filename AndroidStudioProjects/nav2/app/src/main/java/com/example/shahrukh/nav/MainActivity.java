package com.example.shahrukh.nav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] names={"First","Second","Third","Fourth","Fifth"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.activity_list_item,names);
        listView.setAdapter(adapter);

    }
}
