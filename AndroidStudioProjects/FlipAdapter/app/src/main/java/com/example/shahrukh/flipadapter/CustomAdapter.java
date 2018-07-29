package com.example.shahrukh.flipadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class CustomAdapter extends BaseAdapter{

    Context context;
    int[] images;
    String[] Pname;
    LayoutInflater inflater;


    public CustomAdapter(Context applicationContext, String[] pname, int[] images ){

        this.context=applicationContext;
        this.images=images;
        this.Pname=pname;
        inflater=(LayoutInflater.from(applicationContext));


    }





    @Override
    public int getCount() {



        return Pname.length;
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


        convertView= inflater.inflate(R.layout.list_item,null);
        TextView Pname=(TextView)convertView.findViewById(R.id.textView);
        ImageView image=(ImageView)convertView.findViewById(R.id.imageView);
        image.setImageResource(images[position]);


        return convertView;
    }
}
