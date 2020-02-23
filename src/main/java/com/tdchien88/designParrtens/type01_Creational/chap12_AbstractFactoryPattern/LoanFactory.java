package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern;

import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank.Bank;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.BussinessLoan;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.EducationLoan;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.HomeLoan;
import com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.loan.Loan;

public class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}
