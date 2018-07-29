package com.example.shahrukh.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Satuarday","Sunday"};
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,days);
        autoCompleteTextView.setAdapter( adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

    }
}
