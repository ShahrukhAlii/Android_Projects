package com.example.shahrukh.ratings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String totnum="Rating"+ratingBar.getNumStars();
               String Rat="RAting"+ratingBar.getRating();
                Toast.makeText(getApplicationContext(),totnum,Toast.LENGTH_LONG).show();

            }
        });
    }
}
