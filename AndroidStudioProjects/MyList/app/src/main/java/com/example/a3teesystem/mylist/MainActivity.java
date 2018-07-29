package com.example.a3teesystem.mylist;

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
    String[] memeDescrptions;
    int[] img={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listView);

        myAdapter adapter=new myAdapter(this,memeTitles,memeDescrptions,img);
        list.setAdapter(adapter);


        Resources res=getResources();
        res.getStringArray(R.array.Titiles);
        res.getStringArray(R.array.description);


    }


}
 class myAdapter extends ArrayAdapter<String>{

    Context context;
    String[] titleArray;
    int[] descriptionArray;
    String[] image;


     public myAdapter(@NonNull Context context, String[] images1, String[] title, int[] desc) {
         super(context,R.layout.single_row,R.id.textView );

          this.titleArray=title;
          this.descriptionArray=desc;
          this.image=images1;
          this.context=context;



     }

     @NonNull
     @Override
     public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

          View row=inflater.inflate(R.layout.single_row,parent,false);

         ImageView imag=(ImageView)row.findViewById(R.id.imageView2);
         TextView titl=(TextView)row.findViewById(R.id.textView);
         TextView description=(TextView)row.findViewById(R.id.textView2);


         imag.setImageResource(Integer.parseInt(image[position]));
         titl.setText(titleArray[position]);
         description.setText(descriptionArray[position]);



         return row;
     }
 }