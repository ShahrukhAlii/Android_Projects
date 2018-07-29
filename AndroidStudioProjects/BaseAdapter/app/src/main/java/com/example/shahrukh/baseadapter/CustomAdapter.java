package com.example.shahrukh.baseadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class CustomAdapter extends BaseAdapter {

    private int animal[];
    private LayoutInflater inflater;
    private Context context;

    CustomAdapter(Context applicationContext, int[] animal){

        this.context=applicationContext;
        this.animal=animal;
        inflater=(LayoutInflater.from(applicationContext));


    }
    @Override
    public int getCount() {
        return animal.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.gridview,null);
        ImageView icon = (ImageView) convertView.findViewById(R.id.imageView);
        icon.setImageResource(animal[position]);
        return convertView;
    }
}
