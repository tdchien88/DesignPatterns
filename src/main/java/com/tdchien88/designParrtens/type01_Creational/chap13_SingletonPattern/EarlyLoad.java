package com.tdchien88.designParrtens.type01_Creational.chap13_SingletonPattern;

public class EarlyLoad {
	private static EarlyLoad obj = new EarlyLoad();// Early, instance will be created at load time

	private EarlyLoad() {
	}

	public static EarlyLoad getEarlyLoad() {
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}