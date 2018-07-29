package com.example.a3teesystem.intent_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import java.time.Instant;

public class bacon extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle appledata = getIntent().getExtras();
if(appledata==null){
    return;

    }

    String appleMessage = appledata.getString("apple Message");
final TextView baconText=(TextView)findViewById(R.id.baconButton);
baconText.setText(appleMessage);

    }

    }

