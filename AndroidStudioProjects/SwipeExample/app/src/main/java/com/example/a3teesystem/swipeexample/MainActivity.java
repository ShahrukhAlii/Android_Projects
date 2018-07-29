package com.example.a3teesystem.swipeexample;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;
        import android.support.v4.app.FragmentTransaction;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    ViewPager viewPager;
    android.app.ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter( new MyAdapterter(fragmentManager));

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        actionBar=getActionBar();
        android.app.ActionBar.Tab tab1=actionBar.newTab();
        actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);
        tab1.setText("Tab1");
        tab1.setTabListener((android.app.ActionBar.TabListener) this);

        android.app.ActionBar.Tab tab2=actionBar.newTab();
        tab2.setText("Tab2");
        tab2.setTabListener((android.app.ActionBar.TabListener) this);


        android.app.ActionBar.Tab tab3=actionBar.newTab();
        tab3.setText((CharSequence) this);
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);


    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
class MyAdapterter extends FragmentPagerAdapter{
    public MyAdapterter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        if(position==0){

            fragment=new  FragmentA();

        }
        if(position==1){

            fragment=new  FragmentB();

        }
        if(position==2){

            fragment=new  FragmentC();

        }



        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
