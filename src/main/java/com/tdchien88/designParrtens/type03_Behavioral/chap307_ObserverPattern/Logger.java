package com.tdchien88.designParrtens.type03_Behavioral.chap307_ObserverPattern;

public class Logger implements DPObserver {

	@Override
	public void update(User user) {
		System.out.println("Logger: " + user);
	}
}