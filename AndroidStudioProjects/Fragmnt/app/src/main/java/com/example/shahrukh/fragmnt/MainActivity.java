package com.example.shahrukh.fragmnt;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FirstFragment,SecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstFragment=(Button)findViewById(R.id.firstfragment);
        SecondFragment=(Button)findViewById(R.id.secondfragment);


        FirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new FirstFragment());
            }
        });


        SecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loadFragment(new SecondFragment());
            }
        });

    }

    public  void loadFragment(Fragment fragment){


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction= fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();


    }

}
