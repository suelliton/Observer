package com.example.suelliton.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Observador
        PoliciaCarro carroPolicia = new PoliciaCarro();

        //Observado
        RoubadoCarro carroRoudado = new RoubadoCarro();

        //adicionar observador ao observado
        carroRoudado.addObserver(carroPolicia);

        //testando
        carroRoudado.frente();
        carroRoudado.esquerda();
        carroRoudado.tras();
        carroRoudado.direita();







    }
}
