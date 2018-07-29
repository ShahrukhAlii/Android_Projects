package com.example.a3teesystem.listimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] memeTitles;
    String[] memeDescriptions;
    int[] images={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Resources res=getResources();
        memeTitles=res.getStringArray(R.array.titles);
        memeDescriptions=res.getStringArray(R.array.descriptions);


        list= findViewById(R.id.listview);
        myAdapter adapter= new myAdapter(this,memeTitles,images,memeDescriptions);
        list.setAdapter(adapter);

    }
}

class myAdapter extends ArrayAdapter<String>{


    private Context context;
    private int[] images;
    private String[] titleArray;
    private String[] descriptionArray;

    myAdapter(Context c,String[] titles,int imgs[],String[] desc ){

        super(c,R.layout.single_row,R.id.textView,titles);


        this.context=c;
        this.images=imgs;
        this.titleArray=titles;
        this.descriptionArray=desc;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        @SuppressLint("ViewHolder") View row= inflater.inflate(R.layout.single_row,parent,false);
        ImageView myImage= row.findViewById(R.id.imageView);
        TextView myTitle= row.findViewById(R.id.textView);
        TextView myDEscription= row.findViewById(R.id.textView2);

        myImage.setImageResource(images[position]);
        myTitle.setText(titleArray[position]);
        myDEscription.setText(descriptionArray[position]);



        return row;
    }
}



















