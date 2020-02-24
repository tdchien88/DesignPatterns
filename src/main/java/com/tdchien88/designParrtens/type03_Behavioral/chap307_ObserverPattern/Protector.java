package com.tdchien88.designParrtens.type03_Behavioral.chap307_ObserverPattern;

public class Protector implements DPObserver {

	@Override
	public void update(User user) {
		if (user.getStatus() == LoginStatus.INVALID) {
			System.out.println(
					"Protector: User " + user.getEmail() + " is invalid. " + "IP " + user.getIp() + " is blocked");
		}
	}
}