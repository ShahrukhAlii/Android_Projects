package com.example.shahrukh.gl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] images={R.drawable.ln,R.drawable.p1,R.drawable.p2,R.drawable.p5,R.drawable.p6,R.drawable.p7};
    Gallery gallery;
    ImageView imageView;
    GalleryAdapter galleryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery=(Gallery)findViewById(R.id.gallery);
        imageView=(ImageView)findViewById(R.id.imageView);
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
