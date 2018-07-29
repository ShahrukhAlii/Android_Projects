package com.example.a3teesystem.tranistion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup buckeyslayout =(RelativeLayout)findViewById(R.id.layout_id);
        buckeyslayout.setOnTouchListener(new RelativeLayout.OnTouchListener(){
                                             @Override
                                             public boolean onTouch(View v, MotionEvent event) {
                                                 moveButton();

                                                 return true;
                                             }
                                         }



        );



    }
    public void moveButton(){

        View Button=findViewById(R.id.buttonId);
        RelativeLayout.LayoutParams posotionRules=new  RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        posotionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        posotionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        Button.setLayoutParams(posotionRules);



ViewGroup.LayoutParams sizeRules=Button.getLayoutParams();
sizeRules.width=400;
sizeRules.height=200;
Button.setLayoutParams(sizeRules);
















    }
}
