package com.example.design.strategy;

public class SpedizioneStandard implements SpedizioneStrategy {
	@Override
    public double calcolaCosto(int pesoPacco) {
        // Costo base di 5 euro più 0,5 euro per ogni chilo
        return 5 + (0.5 * pesoPacco);
    }

}
