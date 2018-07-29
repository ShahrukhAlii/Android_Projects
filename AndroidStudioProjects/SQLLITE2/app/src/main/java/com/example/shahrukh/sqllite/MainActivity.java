package com.example.shahrukh.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   baseHelper baseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseHelper= new baseHelper (this);
        SQLiteDatabase sqLiteDatabase=baseHelper.getWritableDatabase();
    }
}
