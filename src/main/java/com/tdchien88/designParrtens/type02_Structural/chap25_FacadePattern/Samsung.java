package com.tdchien88.designParrtens.type02_Structural.chap25_FacadePattern;

public class Samsung implements MobileShop {
	@Override
	public void modelNo() {
		System.out.println(" Samsung galaxy tab 3 ");
	}

	@Override
	public void price() {
		System.out.println(" Rs 45000.00 ");
	}
}