package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class CreditosActivity extends AppCompatActivity {

    MediaPlayer musicaCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        musicaCreditos = MediaPlayer.create(this, R.raw.creditosmusic);
        musicaCreditos.start();

    }

    public void pantInicio(View view) {
        Intent nuevo = new Intent(CreditosActivity.this, MainActivity.class);
        startActivity(nuevo);
        musicaCreditos.stop();
    }
}
