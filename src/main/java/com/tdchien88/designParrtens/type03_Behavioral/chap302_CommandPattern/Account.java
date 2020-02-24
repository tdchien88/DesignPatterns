package com.tdchien88.designParrtens.type03_Behavioral.chap302_CommandPattern;

public class Account {
	private String name;

	public Account(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("Account [" + name + "] Opened\n");
	}

	public void close() {
		System.out.println("Account [" + name + "] Closed\n");
	}
}