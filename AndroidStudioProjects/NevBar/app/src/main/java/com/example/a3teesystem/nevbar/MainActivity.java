package com.example.a3teesystem.nevbar;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    DrawerLayout drawerLayout;
  //  String[] planets;
    ActionBarDrawerToggle drawerListner;
    MyADapter myADapter;

  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.DrawblList);
        drawerLayout= findViewById(R.id.drawble);
        myADapter=new MyADapter(this);
        listView.setAdapter( myADapter);
      //  planets=getResources().getStringArray(R.array.Planets);
     //   listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planets));
        listView.setOnItemClickListener(this);

       drawerListner=new ActionBarDrawerToggle(this,drawerLayout,R.string.drawble_open,R.string.drawble_close){
//show toast msg while swap the bar
            @Override
            public void onDrawerOpened(View drawerView) {
                Toast.makeText(MainActivity.this,"Drawer Open",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                Toast.makeText(MainActivity.this,"Drawer Close",Toast.LENGTH_LONG).show();
            }
        };
       drawerLayout.setDrawerListener(drawerListner);
       getSupportActionBar().setHomeButtonEnabled(true);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return drawerListner.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListner.onConfigurationChanged(newConfig);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        drawerListner.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
      //  Toast.makeText(this,planets[position]+"was selected",Toast.LENGTH_LONG).show();
        selectItem(position);
    }

    private void selectItem(int position) {
        listView.setItemChecked(position,true);
     //   setTitle(planets[position]);
    }

    @Override
    public void setTitle(int titleId) {
        getSupportActionBar().setTitle(titleId);
    }
}

//My Own Adapter that fetc data from strin g arreay that we have created
class MyADapter extends BaseAdapter{
Context context;
   String[]  Social;


    int[] images={R.drawable.fb,R.drawable.you,R.drawable.sky,R.drawable.wind,R.drawable.twi};
    //to get the arrays from string
    //initialize the social in context
    Social=context.getResources().getStringArray(R.array.Social);
    /**
     *
     */



MyADapter(Context context){



    //get the pictures from drawble

}


    @Override
    public int getCount() {
        return Social.length;
    }

    @Override
    public Object getItem(int position) {
        return Social[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


    View row;
    if(convertView==null){



        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row= inflater.inflate(R.layout.custom_row,parent,parent,null);
    }

    else{
        row=convertView;

    }
    TextView titleText= row.findViewById(R.id.textView);
        ImageView imageTitle=row.findViewById(R.id.imageView2);
        titleText.setText(Social[position]);
        imageTitle.setImageResource(images[position]);
        return null;
    }

}