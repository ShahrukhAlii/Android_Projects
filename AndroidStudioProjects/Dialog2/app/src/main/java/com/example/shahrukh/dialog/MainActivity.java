package com.example.shahrukh.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Exit(View  view){

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Are you sure to Exit!!");
        builder.setIcon(R.drawable.que);
        builder.setMessage("This messgae is from AlertDialog box");
         builder.setCancelable(false);



        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });


        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You should say no",Toast.LENGTH_LONG).show();
            }
        });

        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Thans for watching",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();

    }
}
