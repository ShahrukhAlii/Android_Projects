package com.example.shahrukh.ff;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {


    private String days[];
    private int[] Images;
    private LayoutInflater inflater;
    private Context context;



    public CustomAdapter(Context applicationContext, String[] days, int[] Images) {


        this.context=applicationContext;
        this.Images=Images;
        this.days=days;
        inflater=(LayoutInflater.from(applicationContext));

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
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_custom_adapter,null);
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
        TextView view=(TextView)convertView.findViewById(R.id.textview);
        view.setText(days[position]);
        imageView.setImageResource(Images[position]);




        return null;
    }
}
