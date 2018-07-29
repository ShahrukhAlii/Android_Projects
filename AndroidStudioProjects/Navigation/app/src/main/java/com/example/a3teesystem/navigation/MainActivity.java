package com.example.a3teesystem.navigation;

import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ListView listView;
    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawable);
        listView=(ListView)findViewById(R.id.listview);
        listView1=(ListView)findViewById(R.id.listview12);
    }
}
