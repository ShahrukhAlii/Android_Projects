package com.example.shahrukh.prc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Date;

public class CustomAdapter extends BaseAdapter {

  Context context;
  String Dname[];
  int dpic[];
  LayoutInflater inflater;

  public  CustomAdapter(Context applicationContext,String Dname[], int Dpic[]){

      this.context=applicationContext;
      this.Dname=Dname;
      this.dpic=Dpic;
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

      convertView=inflater.inflate(R.layout.activity_custom_adapter,null);
        ImageView icon=(ImageView)convertView.findViewById(R.id.imageView);
        TextView text =(TextView)convertView.findViewById(R.id.textview);

        text.setText(Dname[position]);
        icon.setImageResource(dpic[position]);




        return convertView;
    }
}
