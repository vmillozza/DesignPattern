package com.example.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Test implements Subject {
    private List<Observer> observers;
    private String risultato;

    public Test() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registraObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void rimuoviObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificaObserver() {
        for (Observer observer : observers) {
            observer.aggiorna(risultato);
        }
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
        notificaObserver();
    }
}
