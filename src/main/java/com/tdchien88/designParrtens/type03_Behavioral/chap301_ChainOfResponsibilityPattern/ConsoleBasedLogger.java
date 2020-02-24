package com.tdchien88.designParrtens.type03_Behavioral.chap301_ChainOfResponsibilityPattern;

public class ConsoleBasedLogger extends Logger {
	public ConsoleBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: " + msg);
	}
}