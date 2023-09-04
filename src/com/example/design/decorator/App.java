package com.example.design.decorator;

//Componente
interface Bevanda {
	String descrizione();

	double costo();
}

//ConcreteComponent
class Caffe implements Bevanda {
	@Override
	public String descrizione() {
		return "Caffè";
	}

	@Override
	public double costo() {
		return 1.0;
	}
}

//Decorator
abstract class CondimentoDecorator implements Bevanda {
	protected Bevanda bevanda;

	public CondimentoDecorator(Bevanda bevanda) {
		this.bevanda = bevanda;
	}

	public abstract String descrizione();
}

//ConcreteDecorator
class Latte extends CondimentoDecorator {
	public Latte(Bevanda bevanda) {
		super(bevanda);
	}

	@Override
	public String descrizione() {
		return bevanda.descrizione() + ", Latte";
	}

	@Override
	public double costo() {
		return bevanda.costo() + 0.5;
	}
}

public class App {
	public static void main(String[] args) {
		Bevanda bevanda = new Caffe();
		System.out.println(bevanda.descrizione() + " €" + bevanda.costo());

		Bevanda bevandaConLatte = new Latte(new Caffe());
		System.out.println(bevandaConLatte.descrizione() + " €" + bevandaConLatte.costo());
	}
}
