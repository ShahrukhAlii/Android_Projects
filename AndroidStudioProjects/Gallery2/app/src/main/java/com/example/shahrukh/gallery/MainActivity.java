
package com.example.shahrukh.gallery;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Gallery gallery;
    GalleryAdapter galleryAdapter;
    int[] images={R.drawable.p1,R.drawable.p2,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.ln};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.imageView);
        gallery=(Gallery)findViewById(R.id.gallery);
        GalleryAdapter galleryAdapter=new GalleryAdapter(getApplicationContext(),images);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(images[position]);
            }
        });
    }
}

class GalleryAdapter extends BaseAdapter{

    int[] context;
    Context images;

    GalleryAdapter(Context images, int[] c){

        this.context=c;
        this.images=images;

    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageView;
    }
}