package com.example.design.observer;

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        // Creazione e registrazione degli studenti (observers)
        Studente studente1 = new Studente("Mario");
        Studente studente2 = new Studente("Luigi");
        
        test.registraObserver(studente1);
        test.registraObserver(studente2);

        // Simulazione della pubblicazione del risultato
        test.setRisultato("Promosso");

        // Rimozione di un observer e nuova notifica
        test.rimuoviObserver(studente1);
        test.setRisultato("Rimandato");
    }
}
