package com.example.shahrukh.my7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    String  name[]={"Shahrukh","Alii","Zubaida","Salma","Shumaila","Rehan","Daniyal"};
    MultiAutoCompleteTextView multiAutoCompleteTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        multiAutoCompleteTextView.setThreshold(2);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());



    }
}
