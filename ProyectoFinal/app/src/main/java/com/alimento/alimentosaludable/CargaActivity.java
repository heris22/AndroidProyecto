package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class CargaActivity extends AppCompatActivity {

    Integer contador = 0;
    Intent nuevoJugar;
    MediaPlayer narracionConsejo;
    Boolean bandera= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga);

        VideoView videoview = (VideoView) findViewById(R.id.videoview);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videocarga);
        videoview.setVideoURI(uri);
        videoview.start();
        nuevoJugar = new Intent(CargaActivity.this, JuegoActivity.class);
        narracionConsejo = MediaPlayer.create(this, R.raw.audioconsejofinal);


    }

    public void pantJuego(View view) {
        Intent nuevo = new Intent(CargaActivity.this, JuegoActivity.class);
        startActivity(nuevo);
        narracionConsejo.stop();

    }




}
