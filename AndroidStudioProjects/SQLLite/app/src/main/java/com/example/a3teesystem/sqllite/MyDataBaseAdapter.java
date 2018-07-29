package com.example.a3teesystem.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//the base method for access the whoole data
public class MyDataBaseAdapter  {

  myHelper helper;

  //constructor
  public MyDataBaseAdapter(Context context){


helper=new myHelper(context);

  }
  //this method insert data
  public long InsertData(String name,String password){


   SQLiteDatabase database=helper.getWritableDatabase();
   ContentValues contentValues=new ContentValues();
   contentValues.put(myHelper.NAME,name);
   contentValues.put(myHelper.PASSWORD,password);
   long id=database.insert(myHelper.TABEL_NAME,null,contentValues);
return id;


  }

//this method gettet the whole datat from our database
public String  getAllData()
{


SQLiteDatabase database=helper.getWritableDatabase();
String[] columns={myHelper.UID,myHelper.NAME,myHelper.PASSWORD};
   Cursor cursor= database.query(myHelper.TABEL_NAME,columns,null,null,null,null,null);

StringBuffer buffer=new StringBuffer();

   while (cursor.moveToNext()){

     /*  int index1=cursor.getColumnIndex(myHelper.UID);
       cursor.getInt(index1);
*/

//that index is to give numbers
     int cid=cursor.getInt(0);
     String name=cursor.getString(1);
     String password=cursor.getString(2);
     buffer.append(cid+" "+name+" "+password+" \n");


   }
   //that return the buffer and convert into string
return buffer.toString();



}

public static class myHelper extends SQLiteOpenHelper{


 private static final String DATABASE_NAME="MyData base";
 private static final  String TABEL_NAME="MyTable";
 private static final int DATABASE_VERSION=4;
 private static final String UID="_id";
 private static final String NAME="name";
 private static final String PASSWORD="password";
 private static final String CREATE="CREATE TABLE"+TABEL_NAME+"("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+",VARCHAR(255r ));";

 private static final String DROP_TABLE="DROP Table if Exists"+NAME;
 private Context context;


 myHelper(Context context) {
  super(context,DATABASE_NAME,null,  DATABASE_VERSION);
  this.context=context;

 }

 @Override
 public void onCreate(SQLiteDatabase db) {

  db.execSQL(CREATE);
  Message.message(context,"MeDatabase");
 }

 @Override
 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


  db.execSQL(DROP_TABLE);
  onCreate(db);

 }

}

}
