package com.example.shahrukh.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button implilcit,Explicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        implilcit=(Button)findViewById(R.id.button2);
        Explicit=(Button)findViewById(R.id.button);



        Explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getBaseContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
        implilcit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Intent.ACTION_VIEW);
                obj.setData(Uri.parse("www.google.com"));
                startActivity(obj);
            }
        });

    }
}
