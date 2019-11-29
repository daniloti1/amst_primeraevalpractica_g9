package com.example.amst_primeraevalpractica_g9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class preguntas extends AppCompatActivity {
    public HashMap diccionario;
    private TextView pregunta;
    private Button opcion1;
    private Button opcion2;
    private Button opcion3;
    private Button opcion4;
    public static int puntuacion = 0;
    public static int contador = 0;
    public LinkedList<String> pregunta_escogida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        pregunta = findViewById(R.id.pregunta);
        opcion1 = findViewById(R.id.opcion1);
        opcion2 = findViewById(R.id.opcion2);
        opcion3 = findViewById(R.id.opcion3);
        opcion4 = findViewById(R.id.opcion4);

        List<String> l1 = new LinkedList<>();
        l1.add("¿Qué actor dio vida al personaje de la “Princesa Fiona” en la película de Shrek?");
        l1.add("Cameron Diaz");
        l1.add("jennifer Lopez");
        l1.add("scarlett Johanson");
        l1.add("Kin Kardashian");
        l1.add("1");

        diccionario = new HashMap();
        diccionario.put("0", l1);

        List<String> l2 = new LinkedList<>();
        l2.add("¿En que año fue el lanzamiento de la primera película de Avengers?");
        l2.add("2010");
        l2.add("2011");
        l2.add("2012");
        l2.add("2013");
        l2.add("3");

        diccionario.put("1", l2);

        List<String> l3 = new LinkedList<>();
        l3.add("¿Cuál es el director de la película Malefica?");
        l3.add("Robert Stromberg");
        l3.add("Alfred Hitchcock");
        l3.add("Roman Polanski");
        l3.add("Steven Spielberg");
        l3.add("1");

        diccionario.put("2", l3);

        List<String> l4 = new LinkedList<>();
        l4.add("¿Cuál de las siguientes músicas se utilizó en el rodaje de la película Deadpol?");
        l4.add("Angel of the morning");
        l4.add("Stayin’ Alive");
        l4.add("Gimme Shelter");
        l4.add("Walking on sunshine");
        l4.add("1");

        diccionario.put("3", l4);

        List<String> l5 = new LinkedList<>();
        l5.add("¿Cómo se llama el perezoso de la era de hielo?");
        l5.add("Sid");
        l5.add("Manny");
        l5.add("Scrat");
        l5.add("Diego");
        l5.add("1");

        diccionario.put("4", l5);

        sorteo();

    }

    public void sorteo() {
        Random rand = new Random();
        Integer n = rand.nextInt(4);
        rand.nextInt();
        pregunta_escogida = (LinkedList<String>) diccionario.get(n.toString());

        pregunta.setText(pregunta_escogida.get(0));
        opcion1.setText(pregunta_escogida.get(1));
        opcion2.setText(pregunta_escogida.get(2));
        opcion3.setText(pregunta_escogida.get(3));
        opcion4.setText(pregunta_escogida.get(4));
    }

    public void contestar1(View v) {
        contador++;
        if(pregunta_escogida.get(5) == "1") {
            puntuacion++;
            if (puntuacion >= 5) {
                Intent intent = new Intent(this, ganador.class);
                startActivity(intent);
            } else {
                sorteo();
            }
        } else {
            Intent intent = new Intent(this, resultado.class);
            startActivity(intent);
        }
    }
    public void contestar2(View v) {
        contador++;
        if(pregunta_escogida.get(5) == "2") {
            puntuacion++;
            if (puntuacion >= 5) {
                Intent intent = new Intent(this, ganador.class);
                startActivity(intent);
            } else {
                sorteo();
            }
        } else {
            Intent intent = new Intent(this, resultado.class);
            startActivity(intent);
        }
    }
    public void contestar3(View v) {
        contador++;
        if(pregunta_escogida.get(5) == "3") {
            puntuacion++;
            if (puntuacion >= 5) {
                Intent intent = new Intent(this, ganador.class);
                startActivity(intent);
            } else {
                sorteo();
            }
        } else {
            Intent intent = new Intent(this, resultado.class);
            startActivity(intent);
        }
    }
    public void contestar4(View v) {
        contador++;
        if(pregunta_escogida.get(5) == "4") {
            puntuacion++;
            if (puntuacion >= 5) {
                Intent intent = new Intent(this, ganador.class);
                startActivity(intent);
            } else {
                sorteo();
            }
        } else {
            Intent intent = new Intent(this, resultado.class);
            startActivity(intent);
        }
    }
}
