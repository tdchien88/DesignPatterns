package com.tdchien88.designParrtens.type01_Creational.chap13_SingletonPattern;

public class LazyLoad {
	private static LazyLoad obj;

	private LazyLoad() {
	}

	public static LazyLoad getLazyLoad() {
		if (obj == null) {
			synchronized (LazyLoad.class) {
				if (obj == null) {
					obj = new LazyLoad();// instance will be created at request time
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}