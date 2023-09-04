package com.example.design.strategy;

public class Ordine {
	private int pesoPacco;
	private SpedizioneStrategy strategia;

	public Ordine(int pesoPacco, SpedizioneStrategy strategia) {
		this.pesoPacco = pesoPacco;
		this.strategia = strategia;
	}

	public double calcolaCostoSpedizione() {
		return strategia.calcolaCosto(pesoPacco);
	}

	public void setStrategia(SpedizioneStrategy strategia) {
		this.strategia = strategia;
	}

}
