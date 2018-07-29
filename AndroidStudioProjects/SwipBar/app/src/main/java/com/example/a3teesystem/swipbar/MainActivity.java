package com.example.a3teesystem.swipbar;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.util.Log;

import static android.support.v7.app.ActionBar.*;

public class MainActivity extends FragmentActivity implements android.app.ActionBar.TabListener {
    android.app.ActionBar actionBar;
    ViewPager viewPager;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {



                Log.d("Message","Tab was selected at "+"position "+position);
            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);

                Log.d("Message","Tab was selected at "+"position "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
             /*   if(state==ViewPager.SCROLL_STATE_IDLE){

                    Log.d("Message","onPageScrollState is SCROLL_STATE_IDLE");

                }
                if(state==ViewPager.SCROLL_STATE_DRAGGING){



                    Log.d("Message","onPageScrollState is SCROLL_STATE_DRAGGING");


                }


                if(state==ViewPager.SCROLL_STATE_SETTLING){



                    Log.d("Message","onPageScrollState is SCROLL_STATE_SETTLING");

                }
*/
            }
        });

        viewPager=(ViewPager)findViewById(R.id.pager);


        actionBar=getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
      //  actionBar.setDisplayShowTitleEnabled(true);
         android.app.ActionBar.Tab tab1=actionBar.newTab();

         tab1.setText("Tab1");

      android.app.ActionBar.Tab tab2=actionBar.newTab();
      tab2.setText("Tab2");
      tab2.setTabListener(this);

      android.app.ActionBar.Tab tab3=actionBar.newTab();
      tab3.setText("Tab3");
      tab3.setTabListener(this);


      actionBar.addTab(tab1);
      actionBar.addTab(tab2);
      actionBar.addTab(tab3);

    }

    @Override
    public void onTabSelected(android.app.ActionBar.Tab tab, FragmentTransaction ft) {

        viewPager.setCurrentItem(tab.getPosition());

       Log.d("Message","Tab was selected at "+"position "+tab.getPosition()+"  name"+tab.getText());

    }

    @Override
    public void onTabUnselected(android.app.ActionBar.Tab tab, FragmentTransaction ft) {


      Log.d("Message","Tab was selected at "+"position "+tab.getPosition()+"  name"+tab.getText());
    }

    @Override
    public void onTabReselected(android.app.ActionBar.Tab tab, FragmentTransaction ft) {


       Log.d("Message","Tab was selected at "+"position "+tab.getPosition()+"  name"+tab.getText());
    }
}

class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        Fragment fragment= null;
        if(position==0){

            fragment=new FragmentA();

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
        return 3;
    }
}