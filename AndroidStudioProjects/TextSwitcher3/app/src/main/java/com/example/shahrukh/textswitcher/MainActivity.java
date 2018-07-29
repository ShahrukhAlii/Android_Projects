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
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextSwitcher textSwitcher;
    String[] text1={"Switcher 1","Switcher 2","Switcher 3","Switcher 4","Switcher 5"};
    int msgcount=text1.length;
    int currentIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        textSwitcher=(TextSwitcher)findViewById(R.id.textswitcher);;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                TextView t= new  TextView(MainActivity.this);
                t.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL);
                t.setTextSize(36);

                return t;
            }
        });
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);


        textSwitcher.setInAnimation(in);
        textSwitcher.setOutAnimation(out);


        textSwitcher.setCurrentText("Welcome to textSwitcher");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if(currentIndex==msgcount){

                    currentIndex=0;
                    textSwitcher.setText(text1 [currentIndex]);

                }
            }
        });

    }
}
