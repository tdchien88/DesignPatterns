package com.tdchien88.designParrtens.type03_Behavioral.chap310_TemplatePattern;

public class HomePage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of home page page");
	}
}