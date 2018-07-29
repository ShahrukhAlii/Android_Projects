package com.example.shahrukh.ff;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satuarday"};
    ListView  listView;
    int Images[]={R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9};

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),days, Images);
        listView.setAdapter(customAdapter);


    }
}
