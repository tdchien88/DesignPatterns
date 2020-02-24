package com.tdchien88.designParrtens.type03_Behavioral.chap309_StrategyPattern;

public class Multiplication implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a * b;
	}
}