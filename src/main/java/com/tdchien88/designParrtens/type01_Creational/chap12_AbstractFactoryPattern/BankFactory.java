package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern;

import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.Bank;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.HDFC;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.ICICI;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.SBI;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.Loan;

public class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}

}
