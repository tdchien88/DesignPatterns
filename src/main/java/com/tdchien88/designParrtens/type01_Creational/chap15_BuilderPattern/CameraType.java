package com.tdchien88.designParrtens.type01_Creational.chap15_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class CameraType {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void getCost() {
		for (Item item : items) {
			item.price();
		}
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Camera name : " + item.name());
			System.out.println(", Price : " + item.price());
		}
	}
}