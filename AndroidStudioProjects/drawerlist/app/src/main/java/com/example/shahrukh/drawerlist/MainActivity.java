package com.example.shahrukh.drawerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

public class MainActivity extends AppCompatActivity {

    Button button;
    SlidingDrawer slidingDrawer;
    ListView listView;
    String[] conting={"First","Second","Third","Fourth","Fifth","Sixth","Seven","Eight","Nine","Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        slidingDrawer=(SlidingDrawer)findViewById(R.id.slidedrawer);
        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.list_item,R.id.textView,conting );
        listView.setAdapter(adapter);


        slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {
                button.setText("Close");
            }
        });

        slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {
                button.setText("Open");
            }
        });
    }
}
