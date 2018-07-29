package com.example.shahrukh.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox java,android,c,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android=(CheckBox)findViewById(R.id.android);
        android.setOnClickListener(this);

        java=(CheckBox)findViewById(R.id.Java);
        java.setOnClickListener(this);

        c=(CheckBox)findViewById(R.id.c);
        c.setOnClickListener(this);

        other=(CheckBox)findViewById(R.id.other);
        other.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.android:
                if(android.isChecked())

                    Toast.makeText(getApplicationContext(),"You check the Android",Toast.LENGTH_LONG).show();

                break;


            case R.id.Java:
                if(java.isChecked())

                    Toast.makeText(getApplicationContext(),"You check the Java",Toast.LENGTH_LONG).show();

                break;





            case R.id.c:
                if(c.isChecked())

                    Toast.makeText(getApplicationContext(),"You check the C language",Toast.LENGTH_LONG).show();

                break;



            case R.id.other:
                if(android.isChecked())

                    Toast.makeText(getApplicationContext(),"You check the Other",Toast.LENGTH_LONG).show();

                break;



        }



    }
}
