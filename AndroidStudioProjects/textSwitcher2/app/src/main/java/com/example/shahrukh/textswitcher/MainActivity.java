package com.example.shahrukh.textswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextSwitcher textSwitcher;
    String[] strings={"This is Text 1","This is Text 2","This is Text 3","This is Text 4","This is Text 5"};
    int messageCount=strings.length;
    int Index=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        textSwitcher=(TextSwitcher)findViewById(R.id.textSwitcher);


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
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        textSwitcher.setInAnimation(in);
        textSwitcher.setOutAnimation(out);




        textSwitcher.setCurrentText("Click to see the view");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Index++;
                if(Index==messageCount){

                    Index=0;


                    textSwitcher.setText(strings[Index]);
                }
            }
        });


    }
}
