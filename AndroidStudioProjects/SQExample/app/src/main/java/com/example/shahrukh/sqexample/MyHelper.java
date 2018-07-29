package com.example.shahrukh.sqexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.SimpleTimeZone;


class myDbAdapter{

    myDbAdapter dbAdapter;
    public myDbAdapter(String name, String pass){

        SQLiteDatabase database = myDbAdapter.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(myDbAdapter.);

    }

}





public class MyHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME="MyDataBase";//mydatabase NAme
    private static final String TABLE_NAME="myTable"; //Table Name
    private static final String UID=   "_id";
    public static final int DATABASE_version=1;
    private static final String NAME="Name";
    private static final String PASSWORD="Password";
    // private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
//" ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255) ,"+ MyPASSWORD+" VARCHAR(225));";
    private static final String DROP_TABLE="Drop Table if Exist "+TABLE_NAME;

    private static final String CREATE_TABLE="Create Table   "+TABLE_NAME+"("+UID+" INTEGER PRIMARY AUTOINCREAMENT, "+NAME+" VARCHAR(225),"+PASSWORD+"  VARCHAR(255) )  ";

    private Context context;



    public MyHelper(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory factory, int DATABASE_version) {
        super(context, DATABASE_NAME, factory, DATABASE_version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Message.message(context, "DatabAse Name");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_TABLE);
        Message.message(context,"Messgae for drop table");

    }
}

