package com.example.shahrukh.viewstub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Gallery gallery;
    int[] images={R.drawable.ln,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12};
    CustomActivity customActivity;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
imageView=(ImageView)findViewById(R.id.imageView);
        gallery=(Gallery)findViewById(R.id.gallery);


CustomActivity activity=new CustomActivity(getApplication(),images);
gallery.setAdapter(activity);
gallery.setSpacing(10);





        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                imageView.setImageResource(images[position]);
            }
        });

    }
}
