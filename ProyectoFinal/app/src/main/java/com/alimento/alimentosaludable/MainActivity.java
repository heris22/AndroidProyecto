package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer musicaInicio, narracionInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicaInicio = MediaPlayer.create(this, R.raw.homemusic);
        musicaInicio.start();
        narracionInicio = MediaPlayer.create(this, R.raw.narracioninicio);
        narracionInicio.start();

    }

    public void pantInfo(View view) {
        Intent nuevo = new Intent(MainActivity.this, CreditosActivity.class);
        startActivity(nuevo);
        musicaInicio.stop();
        narracionInicio.stop();
    }

    public void pantVideo(View view) {
        Intent nuevo = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(nuevo);
        musicaInicio.stop();
        narracionInicio.stop();
    }

    public void cerrarApp(View view) {
        finish();
        moveTaskToBack(true);
        musicaInicio.stop();
        narracionInicio.stop();
    }

    public void pantCarga(View view) {
        Intent nuevo = new Intent(MainActivity.this, CargaActivity.class);
        startActivity(nuevo);
        musicaInicio.stop();
        narracionInicio.stop();
    }

}
