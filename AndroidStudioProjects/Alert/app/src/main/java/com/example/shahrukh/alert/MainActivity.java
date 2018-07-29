package com.example.shahrukh.alert;

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
    public void exit(View view){


        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("Confirm Exit");
        builder.setIcon(R.drawable.que);
        builder.setMessage("Are you sure to to cancel the app!!");
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
                Toast.makeText(MainActivity.this,"You click over no",Toast.LENGTH_LONG).show();
            }
        });


        builder.setNeutralButton("CAncel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Tou click to cancel ",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
