package com.tdchien88.designParrtens.type03_Behavioral.chap312_NullObject;

public class Coder extends Emp {
	public Coder(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}
