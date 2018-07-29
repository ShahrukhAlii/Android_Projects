package com.example.shahrukh.gv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    int pics[]={R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv=(GridView)findViewById(R.id.gridview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),pics);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });

    }
}
