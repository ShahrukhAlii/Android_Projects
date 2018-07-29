package com.example.a3teesystem.myadapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
        list= findViewById(R.id.listView);
        myAdapter adapter=new myAdapter(this,memeTitles,memeDescriptions,images);
        list.setAdapter(adapter);


        Resources res=getResources();
        res.getStringArray(R.array.Titles);
         res.getStringArray(R.array.description);

    }
}

   class myAdapter extends ArrayAdapter<String>{

  private Context
          context;
  private int[] DescriptionsArray;
  private String[] titlesArray;
  private int[] image;


       myAdapter(@NonNull Context context, String[] titles, String[] img, int[] desc) {
           super(context,R.layout.second_row,R.id.textView );

           Context c = null;
           this.context=c;
           this.DescriptionsArray=desc;
           this.titlesArray=titles;


           
       }


       @Override
       public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

           LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           assert inflater != null;
           View row;
           row = inflater.inflate(R.layout.second_row,parent,false);

           ImageView images= row.findViewById(R.id.imageView);
           TextView myTitles= row.findViewById(R.id.textView);
           TextView myDescriptions;
           myDescriptions = row.findViewById(R.id.textView2);


           images.setImageResource(image[position]);
myTitles.setText(titlesArray[position]);
myDescriptions.setText(DescriptionsArray[position]);

           return row;
       }
   }

