package com.example.shahrukh.baseadapter121ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView simpleListview;

    String[] dogsName={"Bhadur","Jatoii","Shedii","Melo","kalo"};
    int[] dogsImages={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListview=(ListView)findViewById(R.id.listview);
        ArrayList<HashMap<String,String >> arrayList=new ArrayList<>();
        for(int i=0;i<dogsName.length;i++){


            HashMap<String,String > hashMap=new HashMap<>();
            hashMap.put("name",dogsName [i]);
            hashMap.put("images",dogsImages [i]+ "");
            arrayList.add(hashMap);

        }
        String[] from={"name","images"};
        int[] to={R.id.textView,R.id.imageView};

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,android.R.layout.simple_list_item_1,from,to);
        simpleListview.setAdapter(simpleAdapter);
        simpleListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),dogsName[position],Toast.LENGTH_LONG).show();
            }
        });
    }


}
