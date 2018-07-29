package com.example.shahrukh.sqexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,password,updateOld,updateNew,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        updateOld=(EditText)findViewById(R.id.oldName);
        updateNew=(EditText)findViewById(R.id.newName);
        delete=(EditText)findViewById(R.id.delete);


    }
    //Method to update the data
    public void AddUser(View view){


    }
    //Method to viewData
    public void viewData(View view){


    }

    //Method to update the data
    public void update(View view){

    }

    //Method to delete the data
    public void delete(View view){


    }



}

