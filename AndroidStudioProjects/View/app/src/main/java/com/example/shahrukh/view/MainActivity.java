package com.example.shahrukh.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

ViewSwitcher viewSwitcher;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button2);
        viewSwitcher=(ViewSwitcher)findViewById(R.id.ViewSwitcher);


        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out =AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        viewSwitcher.setInAnimation(in);
        viewSwitcher.setOutAnimation(out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSwitcher.showNext();
            }
        });



    }
}
