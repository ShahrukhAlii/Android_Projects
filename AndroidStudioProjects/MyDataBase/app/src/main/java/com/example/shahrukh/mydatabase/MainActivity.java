package com.example.shahrukh.mydatabase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;


public class MainActivity extends AppCompatActivity {

    
    BaseHelper baseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseHelper=new BaseHelper(this);
        SQLiteDatabase sqLiteDatabas =baseHelper.getWritableDatabase();

    }
}
