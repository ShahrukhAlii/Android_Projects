package com.example.a3teesystem.navigationbar;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    DrawerLayout drawerLayout;
    ListView listView;
    private int[] Weekend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawble);
        listView=(ListView)findViewById(R.id.listView);
        listView.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,Weekend[position]+"was selected",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setTitle(int titleId) {
        getActionBar().setTitle(titleId);
    }
}
