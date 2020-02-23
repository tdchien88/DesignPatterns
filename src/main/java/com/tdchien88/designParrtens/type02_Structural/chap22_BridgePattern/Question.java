package com.tdchien88.designParrtens.type02_Structural.chap22_BridgePattern;

public interface Question {
	public void nextQuestion();

	public void previousQuestion();

	public void newQuestion(String q);

	public void deleteQuestion(String q);

	public void displayQuestion();

	public void displayAllQuestions();
}
