package com.tdchien88.designParrtens.type03_Behavioral.chap302_CommandPattern;

public class RunMe {

	public static void main(String[] args) {
		Account account = new Account("gpcoder");

		Command open = new OpenAccount(account);
		Command close = new CloseAccount(account);
		BankApp bankApp = new BankApp(open, close);

		bankApp.clickOpenAccount();
		bankApp.clickCloseAccount();
	}

}
