package com.example.a3teesystem.overflow;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


       RelativeLayout menuViewe = (RelativeLayout)findViewById(R.id.menuView);


        switch (item.getItemId()) {

            case R.id.Red_menu:
                if (item.isChecked())
                    item.setChecked(false);

                else
                    item.setChecked(true);
                menuViewe.setBackgroundColor(Color.RED);
                return true;


            case R.id.Green_menu:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                menuViewe.setBackgroundColor(Color.GREEN);
                return true;


            case R.id.Blue_menu:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                menuViewe.setBackgroundColor(Color.BLUE);
                return true;


        }

    return true;




    }
}
