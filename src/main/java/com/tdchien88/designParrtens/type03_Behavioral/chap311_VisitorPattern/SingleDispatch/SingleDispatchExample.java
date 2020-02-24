package com.tdchien88.designParrtens.type03_Behavioral.chap311_VisitorPattern.SingleDispatch;

public class SingleDispatchExample {
	public static void main(String[] args) {
		Customer gpcoder = new Customer();

		System.out.println("====== error case");

		// case 1 ← sai, customer muon mua ProgramingBook, ma lai in ra book
		Book book1 = new ProgramingBook(); // (1)
		gpcoder.buyWrongBook(book1);// customer buy a Book

		// case 2 ← sai, customer muon mua BusinessBook, ma lai in ra book
		Book book2 = new BusinessBook(); // (1)
		gpcoder.buyWrongBook(book2);// customer buy a Book

		System.out.println("====== true case");

		// case 3 ← dung
		ProgramingBook programingBook = new ProgramingBook(); // (2)
		gpcoder.buy(programingBook); // customer buy a Programing Book

		// case 4 ← sai, customer muon mua ProgramingBook, ma lai in ra book
		Book book4 = new ProgramingBook(); // (1)
		gpcoder.buy(book4);// customer buy a Book

		// case 2 ← sai, customer muon mua BusinessBook, ma lai in ra book
		Book book5 = new BusinessBook(); // (1)
		gpcoder.buy(book5);// customer buy a Book

	}
}
