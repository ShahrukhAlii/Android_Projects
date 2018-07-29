package com.example.shahrukh.glprc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Gallery gallery;

    int[] images={R.drawable.ln,R.drawable.p1,R.drawable.p2,R.drawable.p5,R.drawable.p6,R.drawable.p7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView);
        gallery=(Gallery)findViewById(R.id.galery);

        GalleryAdapter galleryAdapter=new GalleryAdapter(getApplicationContext(),images);
        gallery.setAdapter(galleryAdapter);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(images[position]);
            }
        });
    }
}




