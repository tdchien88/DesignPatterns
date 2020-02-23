package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank;

public class ICICI implements Bank {
	private final String BNAME;

	public ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
