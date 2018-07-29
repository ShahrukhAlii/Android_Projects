package com.example.shahrukh.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText e1,e2,e3,e4;
     Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        button=(Button)findViewById(R.id.button2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty() || e3.getText().toString().isEmpty() || e4.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the data", Toast.LENGTH_LONG).show();}



                    else{

                    Toast.makeText(getApplicationContext()," Name- "+e1.getText().toString() +"Password- "+e2.getText().toString()+"Id - "+e3.getText().toString()+ "Contact-  " +e4.getText().toString(),Toast.LENGTH_LONG).show();

                }

                }



        });

    }
}
