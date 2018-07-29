package com.example.shahrukh.viewswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
 int[] pictures={R.drawable.ln,R.drawable.p2,R.drawable.p10,R.drawable.p11,R.drawable.p12};
 int imagescount=pictures.length;
  int currentindex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.imageswitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView img = new ImageView(MainActivity.this);
                img.setScaleType(ImageView.ScaleType.FIT_CENTER);
                img.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
                return img;
            }
        });
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);



        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentindex++;
                if(imagescount==currentindex){

                    currentindex=0;
                    imageSwitcher.setImageResource(pictures[currentindex]);

                }
            }
        });

    }
}
