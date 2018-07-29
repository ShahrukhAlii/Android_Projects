package com.example.shahrukh.baseadapter12;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by 3tee system on 5/3/2018.
 */

public class CustomAdapter extends BaseAdapter {

    int animal[];
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext,int[] animal){

        this.animal=animal;
        this.context=applicationContext;
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

    @SuppressLint({"ViewHolder", "InflateParams", "ResourceType"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        boolean b = convertView == inflater.inflate(R.layout.gridview_item, null);

        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
        imageView.setImageResource(animal[position]);

        return convertView ;

    }
}
