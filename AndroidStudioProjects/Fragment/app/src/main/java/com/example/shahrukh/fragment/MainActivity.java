package com.example.shahrukh.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstfragment,secondfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstfragment=(Button)findViewById(R.id.first_fragment);
        secondfragment=(Button)findViewById(R.id.second_fragment);



        firstfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

loadFragment(new firstFragment());

            }
        });

        secondfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new seconfFragment());

            }
        });



    }
    private void loadFragment(Fragment fragment){

        FragmentManager fm=getFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();




    }
}


