package com.example.shahrukh.animator;

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
    ViewAnimator viewAnimator;

    int images[]={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=( Button)findViewById(R.id.button);
        viewAnimator=(ViewAnimator)findViewById(R.id.Animator);

        for(int i=0;i<images.length;i++){

            ImageView imageView=new ImageView(getApplicationContext());
            imageView.setImageResource(images[i]);
            viewAnimator.addView(imageView);

        }

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out =AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        viewAnimator.setInAnimation(in);
        viewAnimator.setOutAnimation(out);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAnimator.showNext();
            }
        });
    }
}
