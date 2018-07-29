package com.example.shahrukh.ex1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class CustomAdapter extends BaseAdapter {

    Context context;
    int Images[];
    int[] days;
    LayoutInflater inflater;
    public CustomAdapter(Context context, int[] days, String[] images ){

        this.context=context;
        this.days=days;
        this.Images=Images;
       inflater=(LayoutInflater.from(context));


    }


    @Override
    public int getCount() {
        return days.length;
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

        convertView=inflater.inflate(R.layout.custom_layout,null);

        ImageView  imageView=(ImageView)convertView.findViewById(R.id.imageView2);
        TextView view=(TextView)convertView.findViewById(R.id.textView2);
        view.setText(days[position]);
        imageView.setImageResource(Images[position]);


        return convertView;
    }
}
