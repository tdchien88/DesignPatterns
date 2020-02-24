package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.Visitor;

public class JavaCoreBook implements ProgramingBook {

	@Override
	public void belong(Customer v) {
		v.visit(this);
	}

	@Override
	public String getResource() {
		return "https://github.com/gpcodervn/Java-Tutorial/";
	}

	public String getFavouriteBook() {
		return "The most favourite book of java core";
	}
}