package com.example.shahrukh.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox Python,WebProgramming,WebApplication,AndroidApplication,VisualStudio,Java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Python=(CheckBox)findViewById(R.id.checkBox);
        Python.setOnClickListener(this);
        WebProgramming=(CheckBox)findViewById(R.id.checkBox2);
        WebProgramming.setOnClickListener(this);
        WebApplication=(CheckBox)findViewById(R.id.checkBox3);
        WebProgramming.setOnClickListener(this);
        AndroidApplication=(CheckBox)findViewById(R.id.checkBox4);
        AndroidApplication.setOnClickListener(this);
        VisualStudio=(CheckBox)findViewById(R.id.checkBox5);
        VisualStudio.setOnClickListener(this);
        Java=(CheckBox)findViewById(R.id.Checkbox6);
        Java.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.checkBox:
                if(Python.isChecked())
                    Toast.makeText(getApplicationContext(),"Python is Checked",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox2:
                if(WebProgramming.isChecked())
                    Toast.makeText(getApplicationContext(),"Web Programming is Checked",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox3:
                if(AndroidApplication.isChecked())
                    Toast.makeText(getApplicationContext(),"Android Application is Checked",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox4:
                if(VisualStudio.isChecked())
                    Toast.makeText(getApplicationContext(),"Visual Studio is Checked",Toast.LENGTH_LONG).show();
                break;


            case R.id.checkBox5:
                if(WebApplication.isChecked())
                    Toast.makeText(getApplicationContext(),"Web Application is Checked",Toast.LENGTH_LONG).show();
                break;



            case R.id.Checkbox6:
                if(Java.isChecked())
                    Toast.makeText(getApplicationContext(),"Java is Checked",Toast.LENGTH_LONG).show();
                break;


                default:
                    Toast.makeText(getApplication(),"Non of these is checked",Toast.LENGTH_LONG).show();
        }

    }
}
