package com.tdchien88.designParrtens.type03_Behavioral.chap312_NullObject;

public class NoExist extends Emp {
	@Override
	public String getName() {
		return "Not Exist";
	}

	@Override
	public boolean isNull() {
		return true;
	}
}
