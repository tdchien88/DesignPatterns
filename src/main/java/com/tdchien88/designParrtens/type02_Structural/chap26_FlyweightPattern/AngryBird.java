package com.tdchien88.designParrtens.type02_Structural.chap26_FlyweightPattern;

public class AngryBird implements Bird {
	private String color;

	public AngryBird(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Angry Bird: Draw() [Color : " + color);
	}
}