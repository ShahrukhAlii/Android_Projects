package com.example.shahrukh.stub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button show,hide;
    ViewStub viewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show=(Button)findViewById(R.id.button);
        hide=(Button)findViewById(R.id.button1);
        viewStub=(ViewStub)findViewById(R.id.viewStub);
        viewStub.inflate();

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStub.setVisibility(View.GONE);
            }
        });
    }
}
