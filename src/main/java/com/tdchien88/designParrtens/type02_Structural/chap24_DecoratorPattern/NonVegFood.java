package com.tdchien88.designParrtens.type02_Structural.chap24_DecoratorPattern;

public class NonVegFood extends FoodDecorator {
	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
}