package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern;

import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.Bank;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}
