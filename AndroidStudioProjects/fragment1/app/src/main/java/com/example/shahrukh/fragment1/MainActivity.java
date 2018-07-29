package com.example.shahrukh.fragment1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragmrnt , secondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragmrnt=(Button)findViewById(R.id.firstfragment);
        secondFragment=(Button)findViewById(R.id.secondfragment);


        firstFragmrnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment( new firstFragment());


            }
        });


        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new secondFragment());
            }
        });
    }



    private void loadFragment(Fragment fragment){

        FragmentManager fm=getFragmentManager();
        FragmentTransaction fragmentTransaction =fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();


    }

}
