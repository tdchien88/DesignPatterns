package com.tdchien88.designParrtens.type02_Structural.chap26_FlyweightPattern;

import java.util.HashMap;

public class BirdFactory {

	private static final HashMap<String, AngryBird> angrybirdMap = new HashMap<String, AngryBird>();

	public static Bird getAngryBird(String color) {
		AngryBird angrybird = angrybirdMap.get(color);

		if (angrybird == null) {
			angrybird = new AngryBird(color);
			angrybirdMap.put(color, angrybird);
			System.out.println("Creating Angry Bird of color : " + color);
		}
		return angrybird;
	}
}