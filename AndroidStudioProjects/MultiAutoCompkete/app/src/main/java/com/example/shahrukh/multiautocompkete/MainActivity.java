package com.example.shahrukh.multiautocompkete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Satuarday","Sunday"};
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAutoCompleteTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,days);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        multiAutoCompleteTextView.setAdapter(adapter);
    }
}
