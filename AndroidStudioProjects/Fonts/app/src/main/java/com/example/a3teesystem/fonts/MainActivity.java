package com.example.a3teesystem.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        Typeface myfonts= Typeface.createFromAsset(getAssets(),"Fonts/fonts1/Painter_PERSONAL_USE_ONLY.ttf");

        t.setTypeface(myfonts);


    }
}
