package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class GraciasActivity extends AppCompatActivity {

    MediaPlayer musicaGracias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracias);
        musicaGracias = MediaPlayer.create(this, R.raw.ganarmusic);
        musicaGracias.start();
    }

    public void pantInicio(View view) {
        Intent nuevo = new Intent(GraciasActivity.this, MainActivity.class);
        startActivity(nuevo);
        musicaGracias.stop();
    }
}
