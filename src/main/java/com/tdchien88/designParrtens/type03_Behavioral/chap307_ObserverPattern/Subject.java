package com.tdchien88.designParrtens.type03_Behavioral.chap307_ObserverPattern;

public interface Subject {

	void attach(DPObserver observer);

	void detach(DPObserver observer);

	void notifyAllObserver();

}