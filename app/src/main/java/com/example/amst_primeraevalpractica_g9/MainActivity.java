package com.example.amst_primeraevalpractica_g9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static boolean salir = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (salir) {
            salir = false;
            finish();
        }
    }

    public void empezar(View view) {
        Intent intent = new Intent(this, preguntas.class);
        startActivity(intent);
    }
}
