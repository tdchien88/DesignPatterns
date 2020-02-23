package com.tdchien88.designParrtens.type02_Structural.chap22_BridgePattern;

public class QuestionFormat extends QuestionManager {
	public QuestionFormat(String catalog) {
		super(catalog);
	}

	public void displayAll() {
		System.out.println("\n---------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------");
	}
}