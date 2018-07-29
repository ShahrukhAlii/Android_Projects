package com.example.a3teesystem.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Username,Userpassword;
    MyDataBaseAdapter myHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Username=(EditText)findViewById(R.id.name_id);
        Userpassword=(EditText)findViewById(R.id.pass_id);

        myHelper=new MyDataBaseAdapter(this);

    }
    public void AddUser(View view){

        String name=Username.getText().toString();
        String pass=Userpassword.getText().toString();

long id=myHelper.InsertData(name,pass);

        if(id<0){

            Message.message(this,"Unsuccessfull");

        }

        else{
            Message.message(this,"successfuly inserted the row");

        }



    }

    public void ViewDetail(View view){

        String data= myHelper.getAllData();
        Message.message(this,data);

    }
}
