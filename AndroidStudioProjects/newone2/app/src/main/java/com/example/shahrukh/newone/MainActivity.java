package com.example.shahrukh.newone;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ImageView imageView;

    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button8);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.button9);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.button10);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.button11);

        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.button12);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.button13);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.button14);
        b8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button7:
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                Toast.makeText(getApplicationContext(),"Scale type center",Toast.LENGTH_LONG).show();
                break;
            case R.id.button8:
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Toast.makeText(getApplicationContext(),"Center Crop",Toast.LENGTH_LONG).show();
                break;
            case R.id.button9:
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                Toast.makeText(getApplicationContext(),"Center Inside",Toast.LENGTH_LONG).show();
                break;

            case R.id.button10:
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toast.makeText(getApplicationContext(),"Fit Center",Toast.LENGTH_LONG).show();
                break;

            case R.id.button11:
                imageView.setScaleType(ImageView.ScaleType.FIT_END);
                Toast.makeText(getApplicationContext(),"Fit End",Toast.LENGTH_LONG).show();
                break;

            case R.id.button12:
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                Toast.makeText(getApplicationContext(),"Center Crop",Toast.LENGTH_LONG).show();
                break;

            case R.id.button13:
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                Toast.makeText(getApplicationContext(),"Fit XY",Toast.LENGTH_LONG).show();
                break;
            case R.id.button14:
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                Toast.makeText(getApplicationContext(),"Matrix",Toast.LENGTH_LONG).show();
                break;


        }
    }
}
