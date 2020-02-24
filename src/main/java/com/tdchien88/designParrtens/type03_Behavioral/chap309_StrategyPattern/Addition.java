package com.tdchien88.designParrtens.type03_Behavioral.chap309_StrategyPattern;

public class Addition implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a + b;
	}

}