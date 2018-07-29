package com.example.a3teesystem.over_flow;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout menuView = (RelativeLayout) findViewById(R.id.menuText);

        switch (item.getItemId()) {

            case R.id.menu_red:
                if (item.isChecked())
                    item.setChecked(false);

                else

                    item.setChecked(true);
                menuView.setBackgroundColor(Color.RED);

                return true;

            case R.id.menu_green:
                if (item.isChecked())
                    item.setChecked(false);

                else

                    item.setChecked(true);
                menuView.setBackgroundColor(Color.BLUE);

                return true;

            case R.id.menu_yellow:
                if (item.isChecked())
                    item.setChecked(false);

                else

                    item.setChecked(true);
                menuView.setBackgroundColor(Color.GREEN);

                return true;

            default:
                super.onOptionsItemSelected(item);

        }


    return true;

    }
}
