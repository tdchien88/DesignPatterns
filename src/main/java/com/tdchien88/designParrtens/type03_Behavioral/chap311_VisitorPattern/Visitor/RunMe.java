package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.Visitor;

public class RunMe {

	public static void main(String[] args) {

		Customer v = new Customer();

		Book book1 = new BusinessBook();
		Book book2 = new JavaCoreBook();
		Book book3 = new DesignPatternBook();

		book1.belong(v);
		book2.belong(v);
		book3.belong(v);
	}

}
