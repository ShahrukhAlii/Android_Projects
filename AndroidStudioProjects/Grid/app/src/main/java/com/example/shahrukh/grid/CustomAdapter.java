package com.example.shahrukh.grid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter  {

    Context context;
    int logo[];
    LayoutInflater inflater;


    public  CustomAdapter(Context applicationContext,int logos[]){

        this.context=applicationContext;
        this.logo=logos;
        inflater=LayoutInflater.from(applicationContext);

    }



    @Override
    public int getCount() {
        return logo.length;
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

        convertView= inflater.inflate(R.layout.activity_custom_adapter,null);
        ImageView icon =(ImageView)convertView.findViewById(R.id.imageView);
        icon.setImageResource(logo[position]);
        return convertView;
    }
}
