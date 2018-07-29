package com.example.a3teesystem.listwithimage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView l;

    String[] memeTitles;
    String [] memeDescriptions;
    int[] images={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res=getResources();
        memeTitles= res.getStringArray(R.array.Tiles);
        memeDescriptions=res.getStringArray(R.array.Descriptions);

        l= findViewById(R.id.listview);
        myAdapter adapter=new myAdapter(this,memeTitles,images,memeDescriptions);
        l.setAdapter(adapter);

    }
}
class myAdapter extends ArrayAdapter<String>{

    /**
     *
     */
     private Context context;
     private int[] images;
    /**;
     *
     */
    private String[] titleArray;
    private String[] descriptionArray;



    myAdapter(Context c, String[] Titles,int imgs[],String[] desc) {

        super(c, R.layout.second_row, R.id.textView, Titles);
        this.context=c;
        this.images=imgs;
        this.titleArray=Titles;
        this.descriptionArray=desc;

    }


    class MyViewHolder{

        ImageView myImgages;
        TextView myTitles;
        TextView MyDescriotions;
        MyViewHolder(View v){

            myImgages=(ImageView)v.findViewById(R.id.imageView);
            myTitles=(TextView)v.findViewById(R.id.textView);
            MyDescriotions=(TextView)v.findViewById(R.id.textView2);

        }

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        MyViewHolder Holder=null;


       if (row==null) {

           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


           assert inflater != null;
           row = inflater.inflate(R.layout.second_row, parent, false);

           Holder=new MyViewHolder(row);
           row.setTag(Holder);
           Log.d("MyList","Creating a new Row");

       }
       else {

           Holder=(MyViewHolder)row.getTag();
           Log.d("MyList","Recycling the stuff");
       }
       // ImageView myimage = row.findViewById(R.id.imageView);
        //TextView myTitles= row.findViewById(R.id.textView);
        //TextView myDescriptions= row.findViewById(R.id.textView2);


     Holder.myImgages.setImageResource(images[position]);
       Holder.myTitles.setText(titleArray[position]);
        Holder.MyDescriotions.setText(descriptionArray[position]);




        return row;

    }
}
