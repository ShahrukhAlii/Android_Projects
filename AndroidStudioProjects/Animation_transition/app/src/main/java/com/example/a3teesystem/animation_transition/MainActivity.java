package com.example.a3teesystem.animation_transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    ViewGroup buckeysLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        buckeysLayout =(RelativeLayout)findViewById(R.id.BuckyLayout);
        buckeysLayout.setOnTouchListener(new  RelativeLayout.OnTouchListener(){


                                             @Override
                                             public boolean onTouch(View v, MotionEvent event) {
                                                 movebutton();
                                                 return true;
                                             }
                                         }


        );


              }
              public void movebutton(){


        View buckeynutton =findViewById(R.id.buckysButton);
                  TransitionManager.beginDelayedTransition(buckeysLayout);


        RelativeLayout.LayoutParams positionRules =new RelativeLayout.LayoutParams(

                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);


        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
                  positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
                  buckeynutton.setLayoutParams(positionRules);

                  ViewGroup.LayoutParams sizeRules=buckeynutton.getLayoutParams();
                  sizeRules.width=400;
                  sizeRules.height=300;
                  buckeynutton.setLayoutParams(sizeRules);


              }
    }

