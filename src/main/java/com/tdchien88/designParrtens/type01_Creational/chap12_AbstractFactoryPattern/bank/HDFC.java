package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern.bank;

public class HDFC implements Bank {
	private final String BNAME;

	public HDFC() {
		BNAME = "HDFC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}