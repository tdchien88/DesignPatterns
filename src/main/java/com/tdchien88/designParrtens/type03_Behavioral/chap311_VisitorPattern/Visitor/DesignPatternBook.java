package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.Visitor;

public class DesignPatternBook implements ProgramingBook {

	@Override
	public void belong(Customer v) {
		v.visit(this);
	}

	@Override
	public String getResource() {
		return "https://github.com/gpcodervn/Design-Pattern-Tutorial/";
	}

	public String getBestSeller() {
		return "The best Seller of design pattern book";
	}
}