package com.tdchien88.designParrtens.type03_Behavioral.chap310_TemplatePattern;

public class RunMe {

	public static void main(String[] args) {
		PageTemplate homePage = new HomePage();
		homePage.showPage();

		System.out.println();
		PageTemplate detailPage = new DetailPage();
		detailPage.showPage();

		System.out.println();
		PageTemplate contactPage = new ContactPage();
		contactPage.showPage();// TODO Auto-generated method stub

	}

}
