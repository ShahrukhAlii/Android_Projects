package com.example.shahrukh.buutt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox)findViewById(R.id.checkBox);
        c1.setOnClickListener(this);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c2.setOnClickListener(this);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c3.setOnClickListener(this);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        c4.setOnClickListener(this);
        c5=(CheckBox)findViewById(R.id.checkBox5);
        c5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.checkBox:
                if(c1.isChecked())

                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_LONG).show();
                break;

            case R.id.checkBox2:
                if(c2.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox3:
                if(c3.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_LONG).show();
                break;



            case R.id.checkBox4:
                if(c4.isChecked())
                    Toast.makeText(getApplicationContext(),"C#",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox5:
                if(c5.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_LONG).show();
                break;



        }

    }
}
