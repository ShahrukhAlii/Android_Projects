package com.example.shahrukh.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    String[] autoComplete={"Pakistan","China","Australia","Japan","New Zeland"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,autoComplete);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);


    }
}
