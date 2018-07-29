package com.example.a3teesystem.scrolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
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
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }
}


class MyAdapter extends FragmentStatePagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        Log.d("Message","Get item method called");

        if(position==0){

            fragment= new FragmentA();

        }
        if(position==1){

            fragment=new FragmentB();
        }
        if(position==2){
            fragment=new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        Log.d("Message","Count Method is called");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {


            return "Tab 1";
        }
        if (position == 1) {


            return "Tab 2";
        }
        if (position == 2) {


            return "Tab 3";
        }
return null;
    }
}