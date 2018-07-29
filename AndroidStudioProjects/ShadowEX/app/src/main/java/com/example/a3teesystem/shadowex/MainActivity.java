package com.example.a3teesystem.shadowex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView pc1,pc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pc1=(ImageView)findViewById( R.id.Pic1);
        pc2=(ImageView)findViewById(R.id.Pic2);

        pc1.setOnClickListener(this);
        pc2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.Pic1){

            pc1.setVisibility(View.GONE);
            pc2.setVisibility(View.VISIBLE);

        }
        else
        {

            pc1.setVisibility(View.VISIBLE);
            pc2.setVisibility(View.GONE);

        }
    }
}
