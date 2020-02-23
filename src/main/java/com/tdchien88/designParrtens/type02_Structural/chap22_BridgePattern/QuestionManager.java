package com.tdchien88.designParrtens.type02_Structural.chap22_BridgePattern;

public class QuestionManager {
	protected Question q;
	public String catalog;

	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}

	public void next() {
		q.nextQuestion();
	}

	public void previous() {
		q.previousQuestion();
	}

	public void newOne(String quest) {
		q.newQuestion(quest);
	}

	public void delete(String quest) {
		q.deleteQuestion(quest);
	}

	public void display() {
		q.displayQuestion();
	}

	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		q.displayAllQuestions();
	}
}