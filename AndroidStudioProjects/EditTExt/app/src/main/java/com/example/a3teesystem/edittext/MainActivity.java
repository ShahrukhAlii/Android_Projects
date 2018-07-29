package com.example.a3teesystem.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.textclassifier.TextClassificationManager;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText T;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T=(EditText)findViewById(R.id.myText);
        T.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        Toast.makeText(this,"Before Change",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Toast.makeText(this,"During Change", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void afterTextChanged(Editable s) {

        Toast.makeText(this,"After Change",Toast.LENGTH_LONG).show();
    }
}
