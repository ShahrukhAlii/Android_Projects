package com.example.shahrukh.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

public class MainActivity extends AppCompatActivity {

    Button button;
    ListView listView;
    SlidingDrawer slidingDrawer;

    String[] names={"First ","Second","Third","Fourth","Fifth","Sixth","Seven","Eight","Nine","Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.list_content,R.id.textView,names);
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
