package com.example.design.observer;

public class Studente implements Observer {
    private String nome;

    public Studente(String nome) {
        this.nome = nome;
    }

    @Override
    public void aggiorna(String messaggio) {
        System.out.println("Studente " + nome + " ha ricevuto il risultato: " + messaggio);
    }
}

