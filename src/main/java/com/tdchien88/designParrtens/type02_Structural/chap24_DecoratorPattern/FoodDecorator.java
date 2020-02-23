package com.tdchien88.designParrtens.type02_Structural.chap24_DecoratorPattern;

public abstract class FoodDecorator implements Food {
	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}
}