package com.tdchien88.designParrtens.type02_Structural.chap25_FacadePattern;

public class Blackberry implements MobileShop {
	@Override
	public void modelNo() {
		System.out.println(" Blackberry Z10 ");
	}

	@Override
	public void price() {
		System.out.println(" Rs 55000.00 ");
	}
}