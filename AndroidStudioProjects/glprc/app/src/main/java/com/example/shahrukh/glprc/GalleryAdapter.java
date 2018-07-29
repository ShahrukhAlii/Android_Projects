package com.example.shahrukh.glprc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class GalleryAdapter extends BaseAdapter {

    int[] images;
    Context context;

    public GalleryAdapter(Context images, int[] c ){
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(300,300));
        return imageView;
    }
}
