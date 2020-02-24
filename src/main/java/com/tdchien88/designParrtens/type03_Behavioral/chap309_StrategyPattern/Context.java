package com.tdchien88.designParrtens.type03_Behavioral.chap309_StrategyPattern;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public float executeStrategy(float num1, float num2) {
		return strategy.calculation(num1, num2);
	}
}