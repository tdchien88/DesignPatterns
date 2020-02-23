package com.tdchien88.designParrtens.type02_Structural.chap24_DecoratorPattern;

public class ChineeseFood extends FoodDecorator {
	public ChineeseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 65.0;
	}
}