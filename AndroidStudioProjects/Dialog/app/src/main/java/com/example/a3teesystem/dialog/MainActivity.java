package com.example.a3teesystem.dialog;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DialogBox(View view){

        FragmentManager fragmentManager=getFragmentManager();
        MyDialog myDialog=new MyDialog();
        myDialog.show(fragmentManager,"MyDialog");
        
    }

    @Override
    public void DialogMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }
}
