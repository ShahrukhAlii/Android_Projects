package com.example.shahrukh.zoom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

imageView=(ImageView)findViewById(R.id.imageView);
zoomControls=(ZoomControls)findViewById(R.id.zoomControls);
zoomControls.hide();

imageView.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        zoomControls.show();
        return false;
    }
});



zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        float x=imageView.getScaleX();
        float y=imageView.getScaleY();


        imageView.setScaleX((float)(x+1));
        imageView.setScaleY((float)(y+1));


        Toast.makeText(getApplicationContext(),"Zoom in",Toast.LENGTH_LONG).show();
        zoomControls.hide();
    }
});
zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        float x=imageView.getScaleX();
        float y=imageView.getScaleY();



        imageView.setScaleX((float)(x-1));
        imageView.setScaleY((float)(y-1));


        Toast.makeText(getApplicationContext(),"Zoom out",Toast.LENGTH_LONG).show();
        zoomControls.hide();
    }
});




    }
}
