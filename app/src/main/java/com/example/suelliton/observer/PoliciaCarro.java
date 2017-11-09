package com.example.suelliton.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by suelliton on 08/11/2017.
 */

public class PoliciaCarro implements Carro, Observer {
    @Override
    public void frente() {
        Log.i("mensagens","Viatura segue em frente");
    }

    @Override
    public void tras() {
        Log.i("mensagens","Viatura dá ré");
    }

    @Override
    public void esquerda() {
        Log.i("mensagens","Viatura vira á esquerda");
    }

    @Override
    public void direita() {
        Log.i("mensagens","Viatura vira á direita");
    }


    @Override
    public void update(Observable arg0, Object arg1) {
        RoubadoCarro carroRoudado = (RoubadoCarro) arg0;
        String acao = String.valueOf(arg1);
        switch (acao){
            case "frente":
                this.frente();
                break;
            case "tras":
                this.tras();
                break;
            case "direita":
                this.direita();
                break;
            case "esquerda":
                this.esquerda();
                break;
            default:
        }



    }
}
