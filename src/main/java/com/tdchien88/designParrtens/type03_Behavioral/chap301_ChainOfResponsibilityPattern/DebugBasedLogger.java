package com.tdchien88.designParrtens.type03_Behavioral.chap301_ChainOfResponsibilityPattern;

public class DebugBasedLogger extends Logger {
	public DebugBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUG LOGGER INFO: " + msg);
	}
}