package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.Visitor;

public class BusinessBook implements Book {
	@Override
	public void belong(Customer v) {
		v.visit(this);
	}

	public String getPublisher() {
		return "The publisher of business book";
	}
}