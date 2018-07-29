package com.example.shahrukh.spnners123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    Spinner spinner;
    String[] Name={"FirstName","SecondName","ThirdName","FourthName","FifthName"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,Name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getApplicationContext(),Name[position],Toast.LENGTH_LONG).show();

    }
}
