package com.example.shahrukh.aanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    Button button;
    private ViewAnimator viewAnimator;
    int[] images={R.drawable.ln,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        viewAnimator=(ViewAnimator)findViewById(R.id.viewAnimator);
        for(int i=0;i<images.length;i++){
            ImageView imageView=new ImageView(getApplicationContext());
            imageView.setImageResource(images[i]);
            viewAnimator.addView(imageView);
        }

        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);



        viewAnimator.setInAnimation(in);
        viewAnimator.setOutAnimation(out);

        viewAnimator.setAnimateFirstView(false);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAnimator.showNext();
            }
        });
    }
}
