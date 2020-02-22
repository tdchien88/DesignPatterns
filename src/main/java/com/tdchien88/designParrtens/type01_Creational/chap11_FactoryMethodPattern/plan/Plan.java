package com.tdchien88.designParrtens.type01_Creational.chap11_FactoryMethodPattern.plan;

public abstract class Plan {
	protected double rate;

	public abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}