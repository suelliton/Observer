package com.example.suelliton.observer;

import android.util.Log;

import java.util.Observable;

/**
 * Created by suelliton on 08/11/2017.
 */

public class RoubadoCarro extends Observable implements Carro {
    private String acao = "";

    @Override
    public void frente() {
        acao = "frente";
        this.notifica();
        Log.i("mensagens","Ladrao segue em frente");
    }

    @Override
    public void tras() {
        acao = "tras";
        this.notifica();
        Log.i("mensagens","Ladrao da ré");
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        this.notifica();
        Log.i("mensagens","Ladrao vira esquerda");
    }

    @Override
    public void direita() {
        acao = "direita";
        this.notifica();
        Log.i("mensagens","Ladrao vira direita");
    }


    public void notifica() {
        setChanged();
        Log.i("mensagens","---------------------------------");
        notifyObservers(this.acao);
    }
}
