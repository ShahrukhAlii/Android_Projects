package com.example.a3teesystem.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity implements top_section_fragment.topSectionListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    public void createMeme(String top, String bottom ){

       bottomSectionFragment bottomFragment =(bottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
       bottomFragment.setTopMemeText(top,bottom);


    }
}
