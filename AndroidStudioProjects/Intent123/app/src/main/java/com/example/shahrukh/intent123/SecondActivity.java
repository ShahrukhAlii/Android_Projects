package com.example.shahrukh.intent123;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button2);
        editText=(EditText)findViewById(R.id.editText);


        textView.setText("We are on the second activity");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String url=editText.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);

            }
        });




    }
}
