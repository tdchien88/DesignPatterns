package com.tdchien88.designParrtens.type03_Behavioral.chap305_MediatorPattern.chat;

public interface ChatMediator {

	void sendMessage(String msg, User user);

	void addUser(User user);
}