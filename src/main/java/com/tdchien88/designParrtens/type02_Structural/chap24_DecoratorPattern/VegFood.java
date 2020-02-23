package com.tdchien88.designParrtens.type02_Structural.chap24_DecoratorPattern;

public class VegFood implements Food {
	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}
}