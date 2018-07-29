package com.example.shahrukh.rating;

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

        button=(Button)findViewById(R.id.button);
        final RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String totStars="Total Stars"+ratingBar.getNumStars();
                String  rating="RAting"+ratingBar.getRating();

                Toast.makeText(getApplication(),totStars+"\n"+rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}
