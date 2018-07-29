package com.example.shahrukh.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button butt1,butt2;
        FrameLayout frameLayout;

        butt1=(Button)findViewById(R.id.button);
        butt2=(Button)findViewById(R.id.button2);




        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragmnt(new FirstFragment());

            }
        });


        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragmnt(new SecondFragmentActivity() );

            }
        });




    }


    public void loadFragmnt(Fragment fragment){


        FragmentManager manager=getFragmentManager();
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();



    }

}
