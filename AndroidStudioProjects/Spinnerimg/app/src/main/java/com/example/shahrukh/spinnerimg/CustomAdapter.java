
package com.example.shahrukh.spinnerimg;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class CustomAdapter extends BaseAdapter {

  Context context;
  String names[];
  int pics[];
  LayoutInflater inflater;

  public  CustomAdapter(Context applicationContext,String name[],int Pics[]){


      this.context=applicationContext;
      this.names=name;
      this.pics=Pics;
      inflater=LayoutInflater.from(applicationContext);




  }


    @Override
    public int getCount() {
        return names.length;
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


      convertView =inflater.inflate(R.layout.activity_custom_adapter,null);

        ImageView icon =(ImageView)convertView.findViewById(R.id.imageView);
        TextView text =(TextView)convertView.findViewById(R.id.textview);
        text.setText(names[position]);
        icon.setImageResource(pics[position]);

        return  convertView;
    }
}
