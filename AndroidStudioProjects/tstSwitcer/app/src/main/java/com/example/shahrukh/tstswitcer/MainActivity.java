package com.example.shahrukh.tstswitcer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    TextSwitcher textSwitcher;
    Button button;
    String[] name={"This is Text 1","This is Text 2","This is Text 3","This is Text 4","This is Text 5"};
    int messageConunt=name.length;
    int IndexCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=(Button)findViewById(R.id.Button);
        textSwitcher=(TextSwitcher)findViewById(R.id.Switcher);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                TextView t=new TextView(MainActivity.this);
                t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                t.setTextSize(36);

                return t;
            }
        });


        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.z)

    }
}
