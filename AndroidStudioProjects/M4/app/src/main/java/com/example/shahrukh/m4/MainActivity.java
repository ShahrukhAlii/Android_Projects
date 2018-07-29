package com.example.shahrukh.m4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        submit=(Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalstarts ="Simple Rating "+ratingBar.getNumStars();
                String rating ="Total rating "+ratingBar.getRating();

                Toast.makeText(getApplication(),totalstarts+"\n"+rating,Toast.LENGTH_LONG).show();
            }
        });

    }
}
