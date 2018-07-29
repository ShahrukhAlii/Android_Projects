package com.example.shahrukh.frg;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstBUtton,Secondbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstBUtton=(Button)findViewById(R.id.button);
        Secondbutton=(Button)findViewById(R.id.button2);

        firstBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loadFragment(new FirstFragment());

            }
        });


        Secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loadFragment( new SecondFragment());
            }
        });




    }

    private  void loadFragment(Fragment fragment){


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.framlayout,fragment);
        fragmentTransaction.commit();




    }
}
