package com.tdchien88.designParrtens.type03_Behavioral.chap304_IteratorPattern;

public class Item {
	private String title;
	private String url;

	public Item(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", url=" + url + "]";
	}
}