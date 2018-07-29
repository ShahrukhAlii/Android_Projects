package com.example.shahrukh.viewstub;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomActivity extends BaseAdapter{

  private int[] image;
   private Context context;
   public  CustomActivity(Context getapplication,int[] image){

       this.context=getapplication;
       this.image=image;

   }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageView;
    }
}
