package com.tdchien88.designParrtens.type03_Behavioral.chap306_MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class RunMe {

	public static void main(String[] args) {
		List<Memento> savedStates = new ArrayList<>(); // caretaker

		Originator originator = new Originator();

		originator.set("State #1");
		savedStates.add(originator.saveToMemento());

		originator.set("State #2");
		originator.set("State #3");
		savedStates.add(originator.saveToMemento());

		originator.set("State #4");
		savedStates.add(originator.saveToMemento());

		originator.restoreFromMemento(savedStates.get(0)); // This point need roll back
	}
}
