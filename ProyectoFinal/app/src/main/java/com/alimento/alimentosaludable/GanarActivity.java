package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class GanarActivity extends AppCompatActivity {

    MediaPlayer musicaGanar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganar);
        musicaGanar = MediaPlayer.create(this, R.raw.ganarmusic);
        musicaGanar.start();
    }

    public void pantInicio(View view) {
        Intent nuevo = new Intent(GanarActivity.this, MainActivity.class);
        startActivity(nuevo);
        musicaGanar.stop();
    }

    public void pantGracias(View view) {
        Intent nuevo = new Intent(GanarActivity.this, GraciasActivity.class);
        startActivity(nuevo);
        musicaGanar.stop();
    }


}
