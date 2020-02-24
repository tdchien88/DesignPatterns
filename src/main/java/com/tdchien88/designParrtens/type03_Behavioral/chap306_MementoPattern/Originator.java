package com.tdchien88.designParrtens.type03_Behavioral.chap306_MementoPattern;

public class Originator {

	private String state;

	public void set(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}

}