package com.tdchien88.designParrtens.type03_Behavioral.chap306_MementoPattern;

public class Memento {
	private final String state;

	public Memento(String stateToSave) {
		state = stateToSave;
	}

	public String getSavedState() {
		return state;
	}
}