package com.example.shahrukh.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    Button button;
   private ImageSwitcher imageSwitcher;
    int images[]={R.drawable.p4,R.drawable.p3,R.drawable.p2,R.drawable.p1,R.drawable.ln};
    int Count=images.length;
    int CurrentIndex=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     button=(Button)findViewById(R.id.button);
     imageSwitcher=(ImageSwitcher)findViewById(R.id.imageSwitcher);
     imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
         @Override
         public View makeView() {

             ImageView imageView=new ImageView(getApplicationContext());
             imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
             imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT));
             return imageView;

         }
     });

        Animation in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);



        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentIndex++;

                if(CurrentIndex==Count){
                    CurrentIndex=0;
                    imageSwitcher.setImageResource(images[CurrentIndex]);


                }
            }
        });

    }
}
