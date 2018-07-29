package com.example.shahrukh.textswitcher;

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


    Button button;
    TextSwitcher textSwitcher;

    String strings[]={"Text message 1","Text message 2","Text message 3","Text message 4","Text message 5"};
    int messageCount=strings.length;
    int Curentindex=-1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        textSwitcher=(TextSwitcher)findViewById(R.id.textswitcher);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                TextView t=new TextView(MainActivity.this);
                t.setGravity(Gravity.TOP |Gravity.CENTER_HORIZONTAL);
                t.setTextSize(36);

                return t;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        textSwitcher.setAnimation(in);
        textSwitcher.setAnimation(out);


textSwitcher.setCurrentText("Click to o another text");

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(Curentindex==messageCount){

            Curentindex=0;
            textSwitcher.setText(strings[Curentindex]);

        }
    }
});

    }
}
