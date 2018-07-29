package com.example.shahrukh.customadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {
    private Context context;
    private String name[];
    private LayoutInflater inflater;


    CustomAdapter(Context applicationContext, String[] name, int[] dogs) {

        this.context=context;
        int[] flatdog = dogs;
        this.name=name;
        inflater=(LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {

        return  name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.listview,null);
        TextView dog= convertView.findViewById(R.id.textview);
        ImageView image= convertView.findViewById(R.id.imageView);
        dog.setText(name[position]);
        image.setImageResource(dog[position]);
        return convertView;

}
}
