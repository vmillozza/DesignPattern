package com.example.design.strategy;

public class SpedizioneEspresso implements SpedizioneStrategy {
	@Override
    public double calcolaCosto(int pesoPacco) {
        // Costo base di 10 euro più 1 euro per ogni chilo
        return 10 + (1 * pesoPacco);
    }

}
