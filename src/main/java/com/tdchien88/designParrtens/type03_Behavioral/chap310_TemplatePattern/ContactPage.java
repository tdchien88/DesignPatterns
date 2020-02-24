package com.tdchien88.designParrtens.type03_Behavioral.chap310_TemplatePattern;

public class ContactPage extends PageTemplate {

	@Override
	protected void showNavigation() {
		// Just do nothing
		// Because we don't want to show navigation bar on contact page
	}

	@Override
	protected void showBody() {
		System.out.println("Content of contact page");
	}
}