package com.tdchien88.designParrtens.type03_Behavioral.chap302_CommandPattern;

public class OpenAccount implements Command {

	private Account account;

	public OpenAccount(Account account) {
		this.account = account;
	}

	@Override
	public void execute() {
		account.open();
	}
}