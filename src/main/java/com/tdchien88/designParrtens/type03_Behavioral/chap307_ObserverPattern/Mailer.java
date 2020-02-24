package com.tdchien88.designParrtens.type03_Behavioral.chap307_ObserverPattern;

public class Mailer implements DPObserver {

	@Override
	public void update(User user) {
		if (user.getStatus() == LoginStatus.EXPIRED) {
			System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
		}
	}
}