package com.example.design.observer;

public interface Subject {
	void registraObserver(Observer o);

	void rimuoviObserver(Observer o);

	void notificaObserver();

}
