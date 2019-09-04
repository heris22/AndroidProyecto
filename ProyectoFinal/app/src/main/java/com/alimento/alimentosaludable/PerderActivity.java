package com.alimento.alimentosaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perder);
    }

    public void pantInicio(View view) {
        Intent nuevo = new Intent(PerderActivity.this, MainActivity.class);
        startActivity(nuevo);
    }


}
