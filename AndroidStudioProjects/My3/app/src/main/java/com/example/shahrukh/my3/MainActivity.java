package com.example.shahrukh.my3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton Shemus,John,Taker,Rock;
    Button submit;
    String selectedStar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shemus=(RadioButton)findViewById(R.id.radioButton);
        John=(RadioButton)findViewById(R.id.radio2);
        Taker=(RadioButton)findViewById(R.id.radio3);
        Rock=(RadioButton)findViewById(R.id.radio4);
        submit=(Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Shemus.isChecked()) {

                    selectedStar = Shemus.getText().toString();

                }

                else if(John.isChecked()){


                    selectedStar=John.getText().toString();


                }

                else if(Taker.isChecked()){


                    selectedStar=Taker.getText().toString();


                }

                else if(Rock.isChecked()){

                    selectedStar=Rock.getText().toString();

                }

                Toast.makeText(getApplication(),selectedStar,Toast.LENGTH_LONG).show();

            }
        });


    }
}
