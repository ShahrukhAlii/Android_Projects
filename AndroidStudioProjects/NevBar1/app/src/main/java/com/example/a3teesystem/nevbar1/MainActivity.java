package com.example.a3teesystem.nevbar1;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
ListView listView;
DrawerLayout drawerLayout;
String[] weekend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.drawableList);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawlbe);
        weekend=getResources().getStringArray(R.array.Weekend);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,weekend));
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,weekend[position]+"was selected",Toast.LENGTH_LONG).show();
        selectItem(position);
    }

    private void selectItem(int position) {
        listView.setItemChecked(position,true);
        setTitle(weekend[position]);

    }

    @Override
    public void setTitle(int titleId) {
        getSupportActionBar().setTitle(titleId);
    }
}
