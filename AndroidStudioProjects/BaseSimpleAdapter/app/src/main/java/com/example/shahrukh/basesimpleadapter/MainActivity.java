package com.example.shahrukh.basesimpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    String[] dogsname={"Malha","Jmalii","Khokher,Palhwan,Dhuran"};
    int[] dognsImages={R.drawable.i1,R.drawable.i2,R.drawable.i8,R.drawable.i10,R.drawable.i9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView=(ListView)findViewById(R.id.listView1);
        ArrayList <HashMap<String,String> >arrayList=new ArrayList<>();

        for(int i=0;i<dogsname.length ; i++){

            HashMap<String,String> hashMap=new HashMap();
            hashMap.put("name",dogsname[i]);
            hashMap.put("images",dognsImages[i]+ " ");
            arrayList.add(hashMap);


        }
        String[] from={"name","images"};
        int[] to={R.id.textView,R.id.imageView2};
        CustomAdapter adapter=new  CustomAdpter(this,arrayList,android.R.layout.activity_list_item);
        simpleListView.setAdapter(adapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),dogsname[i],Toast.LENGTH_LONG).show();
            }
        });

    }



}
