package com.example.a3teesystem.scrollbar1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyADapter(fragmentManager));

    }
}

class MyADapter extends FragmentPagerAdapter{
    public MyADapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
Fragment fragment=new Fragment();
        Log.d("Message","This is from item");

        if(position==0){

       fragment=new FragmentA();
        }
        if(position==1){

            fragment=new FragmentB();
        }
        if(position==2){

            fragment=new FragmentC();
        } if(position==3){

            fragment=new FragmentD();
        }


        return fragment;
    }

    @Override
    public int getCount() {
        Log.d("Message","This is from count");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0){

            return "Tab1";
        }
        if(position==1){

            return "Tab2";
        }
        if(position==2){

            return "Tab3";
        }
        if(position==3){

            return "Tab4";
        }

        return null;
    }
}
