package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoview = (VideoView) findViewById(R.id.videoview);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoinicio);
        videoview.setVideoURI(uri);
        videoview.start();

    }

    public void pantInicio(View view) {
        Intent nuevo = new Intent(VideoActivity.this, MainActivity.class);
        startActivity(nuevo);
    }

    public void pantPlay(View view) {
        videoview.start();
    }

}
