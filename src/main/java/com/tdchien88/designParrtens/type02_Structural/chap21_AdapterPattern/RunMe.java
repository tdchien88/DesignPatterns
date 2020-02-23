package com.tdchien88.designParrtens.type02_Structural.chap21_AdapterPattern;

public class RunMe {

	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}

}
