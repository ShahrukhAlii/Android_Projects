package com.example.a3teesystem.gridview;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView myGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGrid=(GridView)findViewById(R.id.gridView);
        myGrid.setAdapter(new myAdapter(this));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
class  Country{



        int countryName;
        String imgagesid;

    Country(int country_name , String imagesID){

        this.imgagesid=imagesID;
        this.countryName=country_name;
    }

        }

class myAdapter extends BaseAdapter{


ArrayList<Country> List;

Context context;

myAdapter(Context context){
this.context=context;

    List=new ArrayList<Country>();


    Resources res=context.getResources();
    String[] tempCountryName=res.getStringArray(R.array.Country_name);
    int[] imageCountry={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,};

    for (int i=0;i<=10;i++){
        Country tempCountry=new Country(imageCountry[i],tempCountryName[i]);
        List.add(tempCountry);
    }

}


    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int position) {
        return List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


    View row;
        row = View;
        ViewHolder holder=null;

        if(row==null) {




        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    row = inflater.inflate(R.layout.single_item, ViewGroup , false);
    holder =new ViewHolder(row);
    row.setTag(holder);



    }
    else {

            holder=(ViewHolder) row.getTag();

        }

        Country temp =List.get(position);

        holder.myCountry.setImageResource(Integer.parseInt(temp.imgagesid));


        return row;
    }





    class ViewHolder{

    ImageView myCountry;
    ViewHolder(View v){

        myCountry=v.findViewById(R.id.imageView);

    }
    




    }
}