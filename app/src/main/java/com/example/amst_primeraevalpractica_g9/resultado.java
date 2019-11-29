package com.example.amst_primeraevalpractica_g9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Integer puntuacion = preguntas.puntuacion;
        String r = "Has respondido "+puntuacion.toString()+" preguntas";
        resultado = findViewById(R.id.resultado_text);
        resultado.setText(r);
        preguntas.contador = 0;
        preguntas.puntuacion = 0;
    }

    public void salir(View view) {
        finish();
    }

    public void volver_jugar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
