package com.example.shahrukh.custmprc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {


    Context context;
    String Dname[];
    int Dpic[];
    LayoutInflater inflater;


    public CustomAdapter(Context applicationContext,String Dname[],int Dpics[]){


        this.context=applicationContext;
        this.Dname=Dname;
        this.Dpic=Dpics;
        inflater=LayoutInflater.from(applicationContext);
    }


    @Override
    public int getCount() {
        return Dname.length;
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

        inflater.inflate(R.layout.activity_custom_adapter,null);
        ImageView icon =(ImageView)convertView.findViewById(R.id.imageView);
        TextView text =(TextView)convertView.findViewById(R.id.textview);
        text.setText(Dname[position]);
        icon.setImageResource(Dpic[position]);



        return convertView;
    }
}
