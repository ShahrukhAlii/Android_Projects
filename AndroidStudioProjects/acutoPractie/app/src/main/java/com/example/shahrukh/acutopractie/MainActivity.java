package com.example.shahrukh.acutopractie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String[] AutoComplete={"Pakistan","China","India","New Zeland","Japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,AutoComplete);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setThreshold(2);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
