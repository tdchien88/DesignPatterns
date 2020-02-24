package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.SingleDispatch;

public class Customer {

	public void buyWrongBook(Book book) {
		System.out.println("Customer buy a Book");
	}

	public void buy(Book book) {
		if (book instanceof ProgramingBook) {
			ProgramingBook programingBook = (ProgramingBook) book;
			buy(programingBook);
		} else if (book instanceof BusinessBook) {
			BusinessBook businessBook = (BusinessBook) book;
			buy(businessBook);
		} else {
			System.out.println("Developer buy a Book");
		}
	}

	public void buy(ProgramingBook book) {
		System.out.println("Customer buy a Programing Book");

	}

	public void buy(BusinessBook book) {
		System.out.println("Customer buy a Business Book");
	}
}