package com.example.a3teesystem.googlemap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view){
        Intent intent =null, chooser=null;
      if(view.getId()==R.id.button1){



          intent=new Intent(Intent.ACTION_VIEW);
          intent.setData(Uri.parse("geo:19.2343,72.456"));
          chooser=intent.createChooser(intent,"Launch Map");
          startActivity(chooser);


      }



      if(view.getId()==R.id.button2){
         intent=new Intent(Intent.ACTION_VIEW);
         intent.setData(Uri.parse("Market://details?id=net.zedge.android&hl=en"));
         chooser.createChooser(intent,"Launch Market");
         startActivity(chooser);

      }

      if(view.getId()==R.id.button3){


          intent=new Intent(Intent.ACTION_VIEW);
          intent.setData(Uri.parse("Emailto"));
          String[] to={"Shahrukhsanjrani21@gmail.com","SikanderAlii498@yahoo.com"};

          intent.putExtra(intent.EXTRA_EMAIL ,to);
          intent.putExtra(intent.EXTRA_SUBJECT,"Heyy this was send from my Mail");
          intent.putExtra(intent.EXTRA_TEXT,"Hey whats going on fella");
          intent.setType("message/rfc822");
          chooser=Intent.createChooser(intent,"Send Email");

          startActivity(chooser);

          if(view.getId()==R.id.button4){


              Uri UriImage= Uri.parse("android.resource://com.example.a3teesystem.googlemap/drawable/"+R.drawable.ic_launcher_background);
              intent=new Intent(Intent.ACTION_SEND);
              intent.setType("Image/*");
              intent.putExtra(Intent.EXTRA_STREAM,UriImage);
              intent.putExtra(Intent.EXTRA_TEXT,"Hey there ");
              chooser=Intent.createChooser(intent,"Send Image");
              startActivity(chooser);





          }



      }





    }


    }


