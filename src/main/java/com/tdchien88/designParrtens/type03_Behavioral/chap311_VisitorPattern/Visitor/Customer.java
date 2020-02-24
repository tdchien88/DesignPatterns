package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.Visitor;

public class Customer {

	public void visit(BusinessBook a) {
		System.out.println(a.getPublisher());
	}

	public void visit(DesignPatternBook w) {
		System.out.println(w.getBestSeller());
	}

	public void visit(JavaCoreBook g) {
		System.out.println(g.getFavouriteBook());
	}
}