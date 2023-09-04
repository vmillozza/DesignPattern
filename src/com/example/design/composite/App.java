package com.example.design.composite;

/*
 In questo esempio:

Impiegato è l'interfaccia di base che rappresenta un singolo componente.
Dipendente è una "foglia" (Leaf) nel pattern Composite, rappresentando un singolo impiegato senza sottoposti.
Manager è il "Composite" in questo pattern. Un manager può avere altri impiegati o manager come suoi sottoposti.
Il programma crea una struttura ad albero in cui il CEO Simone ha due sottoposti: Roberto e Luca. Roberto, a sua volta, ha due sottoposti, Marco e Anna, mentre Luca ha un sottoposto, Mario.

Quando chiami il metodo mostraDettagli() sul CEO, ottieni tutti i dettagli dell'intera organizzazione.
*/
import java.util.ArrayList;
import java.util.List;

// Interfaccia Component
interface Impiegato {
	void mostraDettagli();
}

// Leaf
class Dipendente implements Impiegato {
	private String nome;
	private String ruolo;

	public Dipendente(String nome, String ruolo) {
		this.nome = nome;
		this.ruolo = ruolo;
	}

	@Override
	public void mostraDettagli() {
		System.out.println("Dipendente: " + nome + ", Ruolo: " + ruolo);
	}
}

// Composite
class Manager implements Impiegato {
	private String nome;
	private boolean ceo;
	private List<Impiegato> sottoposti = new ArrayList<>();

	public Manager(String nome,boolean ceo) {
		this.nome = nome;
		this.ceo = ceo;
	}

	public void aggiungi(Impiegato impiegato) {
		sottoposti.add(impiegato);
	}

	public void rimuovi(Impiegato impiegato) {
		sottoposti.remove(impiegato);
	}

	@Override
	public void mostraDettagli() {
		System.out.println("Manager: " + nome);
		System.out.println("Ceo: " + ceo);
		for (Impiegato impiegato : sottoposti) {
			impiegato.mostraDettagli();
		}
	}
}

public class App {
	public static void main(String[] args) {
		Dipendente marco = new Dipendente("Marco", "Sviluppatore");
		Dipendente anna = new Dipendente("Anna", "Designer");

		Manager roberto = new Manager("Roberto",false);
		roberto.aggiungi(marco);
		roberto.aggiungi(anna);

		Dipendente mario = new Dipendente("Mario", "Marketing");
		Manager luca = new Manager("Luca",false);
		luca.aggiungi(mario);

		Manager ceo = new Manager("Simone",true);
		ceo.aggiungi(roberto);
		ceo.aggiungi(luca);

		ceo.mostraDettagli();
	}
}
