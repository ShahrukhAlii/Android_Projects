package com.example.a3teesystem.newmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Process(View view){

        Intent intent =null,chooser=null;

     //for google map
        if(view.getId()==R.id.button1){

            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.233,72.221"));
            chooser=Intent.createChooser(intent,"Launch Map");
            startActivity(chooser);


        }
        //for google Market
        if(view.getId()==R.id.button2){

        intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("Market://details?id=net.zedge.android&hl=en"));
        chooser=Intent.createChooser(intent,"Launch Market");
        startActivity(chooser);

        }

        //FOr Email
        if(view.getId()==R.id.button3){

            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("Emailto"));
            String[] to={"Shahrukhsanjrani21@gmail.com","sikanderalii498@yahoo.com"};
            intent.putExtra(intent.EXTRA_EMAIL,to);
            intent.putExtra(intent.EXTRA_SUBJECT,"This itext is send from my app");
            intent.putExtra(intent.EXTRA_TEXT,"Hey there honeyy");
            chooser=Intent.createChooser(intent,"Send Email");
            intent.setType("Meassage/rfc822");
            startActivity(chooser);

        }

    }
}
