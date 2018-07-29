package com.example.a3teesystem.menubar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();

        if(id==R.id.firstBar) {


            Intent i = new Intent(MainActivity.this, FirstActivity.class);
            startActivity(i);
            return true;
        }
            if (id == R.id.secondBar) {

                //code
                return true;
            }


            if(id==R.id.thirdBar){


                return true;

            }
            return true;
        }



    }


