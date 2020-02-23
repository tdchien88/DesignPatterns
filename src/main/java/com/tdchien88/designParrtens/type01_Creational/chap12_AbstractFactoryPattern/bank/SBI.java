package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank;

public class SBI implements Bank {
	private final String BNAME;

	public SBI() {
		BNAME = "SBI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}