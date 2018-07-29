package com.example.shahrukh.spinnerimg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    int pics[]={R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9};
    String name[] ={"Name 1","Name 2", "Name 3" ,"Name 4"," Name5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),name,pics);
        spinner.setAdapter(customAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        Toast.makeText(getApplicationContext(),name[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
