package com.tdchien88.designParrtens.type03_Behavioral.chap304_IteratorPattern;

public class RunMe {

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.addItem(new Item("Home", "/home"));
		menu.addItem(new Item("Java", "/java"));
		menu.addItem(new Item("Spring Boot", "/spring-boot"));

		ItemIterator<Item> iterator = menu.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
	}

}
