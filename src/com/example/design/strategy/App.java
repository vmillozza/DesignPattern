package com.example.design.strategy;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordine ordine = new Ordine(10, new SpedizioneStandard());
		System.out.println("Costo Spedizione Standard: " + ordine.calcolaCostoSpedizione());

		// Cambiamo strategia di spedizione
		ordine.setStrategia(new SpedizioneEspresso());
		System.out.println("Costo Spedizione Espresso: " + ordine.calcolaCostoSpedizione());

	}

}
