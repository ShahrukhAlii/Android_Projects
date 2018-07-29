package com.example.a3teesystem.showdialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ShowDialog(View view){


      FragmentManager fragmentManager=getFragmentManager();
      MyDialog myDialog= new MyDialog();
      myDialog.show(fragmentManager,"my Dialog");

    }
}
