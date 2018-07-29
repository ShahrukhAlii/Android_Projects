package com.example.shahrukh.video;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=(VideoView)findViewById(R.id.videoView);
        if(mediaController==null){

            mediaController =new MediaController(MainActivity.this);
            mediaController.setAnchorView(videoView);


        }

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=JAiVIk9GUW0"+getPackageName()));
        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(),"Thanks for watching",Toast.LENGTH_LONG).show();
            }
        });
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(getApplicationContext(),"Oopps you might be some problem ",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
