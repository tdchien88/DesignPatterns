package com.tdchien88.designParrtens.type03_Behavioral.chap305_MediatorPattern.chat;

/**
 * ConcreteColleague
 */
public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println("---");
		System.out.println(this.name + " is sending the message: " + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " received the message: " + msg);
	}
}