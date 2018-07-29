package com.example.a3teesystem.takepicture;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    File myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Process(View view){

        Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
       myImage =new  File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"test.jpg");

       Uri tempuri= Uri.fromFile(myImage);

        i.putExtra(MediaStore.EXTRA_OUTPUT,tempuri);
        i.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
        startActivityForResult(i,0);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if(requestCode==0){

            switch (requestCode){

                case Activity.RESULT_OK:
                    if(myImage.exists()){

                        Toast.makeText(this,"Fave has been succesfully saved"+myImage.getAbsolutePath(),Toast.LENGTH_LONG).show();
                    }

                    else{

                        Toast.makeText(this,"There is an erroe",Toast.LENGTH_LONG).show();

                    }



                case  Activity.RESULT_CANCELED:
                    break;
            }

        }


    }
}
