package com.example.a3teesystem.navigation;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ListView listView;
    String[] planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planets));
        planets=getResources().getStringArray(R.array.planets);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawable1);

        listView = (ListView) findViewById(R.id.listview);


    }
}
