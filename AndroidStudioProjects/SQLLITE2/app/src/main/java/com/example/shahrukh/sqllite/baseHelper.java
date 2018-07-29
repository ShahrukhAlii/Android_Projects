package com.example.shahrukh.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class baseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="MyDatabase";
    private static final  String TABLE_NAME="MyTable";
    private static final  int Database_Version=1;
    private static final String UID="_id";
    private static final String Name="name";
 private static final String CREATE_TABLE="CREATE_TABLE "+TABLE_NAME+"("+UID+"INTEGER PRIMARY AUTOINCREAMENT, "+Name+" VARCHAR(225)" ;

 private Context context;
 private static final String DROP_TABLE="DROP_TABLE  IF EXISTS "+TABLE_NAME ;



    baseHelper(Context context) {


        super(context,DATABASE_NAME , null, Database_Version);
        this.context=context;
        Message.message(context,"Constructoe called");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //Create Table My_Table (id_ INTEGER PRIMARY KEY,AUTOINCREMENT,Name varchar(255));

        db.execSQL(CREATE_TABLE);
        Message.message(context,"DataBAse is created");




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        db.execSQL(DROP_TABLE);
        onCreate(db);

    }
}

