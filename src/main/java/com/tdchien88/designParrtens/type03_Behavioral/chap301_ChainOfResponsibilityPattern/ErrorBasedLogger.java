package com.tdchien88.designParrtens.type03_Behavioral.chap301_ChainOfResponsibilityPattern;

public class ErrorBasedLogger extends Logger {
	public ErrorBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: " + msg);
	}
}