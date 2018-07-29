package com.example.shahrukh.media;

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

            mediaController=new MediaController(MainActivity.this);
            mediaController.setAnchorView(videoView);

        }


        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4"));
        videoView.start();


        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                Toast.makeText(getApplicationContext(),"Than you for watching",Toast.LENGTH_LONG).show();

            }
        });
videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {

        Toast.makeText(getApplicationContext(),"Opps something went wrong",Toast.LENGTH_LONG).show();
        return false;
    }
});
    }
}
