package com.example.shahrukh.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ZoomControls zoomControls;
    Button show,hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(Button)findViewById(R.id.button);
        hide=(Button)findViewById(R.id.button2);
        zoomControls=(ZoomControls)findViewById(R.id.zoomcontrol);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomControls.show();
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomControls.hide();
            }
        });
    }
}
