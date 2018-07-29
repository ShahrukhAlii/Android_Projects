package com.example.shahrukh.fish;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
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

            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

            videoView.setMediaController(mediaController);
            videoView.setVideoURI(Uri.parse("https://videos.pexels.com/videos/blurred-bokeh-video-855204"+getPackageName() +"/" ));
            videoView.start();

        }
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplication(),"Thank uu",Toast.LENGTH_LONG).show();
            }
        });


        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {

                Toast.makeText(getApplicationContext(),"Sorry there was an error",Toast.LENGTH_LONG).show();

                return false;
            }
        });
    }
}
