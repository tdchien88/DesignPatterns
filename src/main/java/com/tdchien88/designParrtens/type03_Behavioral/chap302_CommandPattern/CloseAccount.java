package com.tdchien88.designParrtens.type03_Behavioral.chap302_CommandPattern;

public class CloseAccount implements Command {

	private Account account;

	public CloseAccount(Account account) {
		this.account = account;
	}

	@Override
	public void execute() {
		account.close();
	}
}