package com.example.shahrukh.imageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] Pnames;
    int[] images;
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext,String[] Pname ,int[] Pimages ){

        this.context=applicationContext;
        this.Pnames=Pname;
        this.images=Pimages;
        inflater=(LayoutInflater.from(applicationContext));



    }


    @Override
    public int getCount() {
        return Pnames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.item_list,null);
        TextView view=(TextView)convertView.findViewById(R.id.textview);
        ImageView imageView=convertView.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);


        return convertView;
    }
}
