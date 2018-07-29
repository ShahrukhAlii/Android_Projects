package com.example.shahrukh.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class GalleryAdapter extends BaseAdapter {

    Context context;
    int[] images;


    public GalleryAdapter(Context applicationContext, int[] images) {

        this.context=applicationContext;
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));


        return imageView;
    }
}








