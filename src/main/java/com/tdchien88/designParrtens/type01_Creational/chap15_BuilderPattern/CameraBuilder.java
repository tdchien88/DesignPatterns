package com.tdchien88.designParrtens.type01_Creational.chap15_BuilderPattern;

public class CameraBuilder {
	public CameraType buildSonyCD() {
		CameraType camType = new CameraType();
		camType.addItem(new Sony());
		return camType;
	}

	public CameraType buildSamsungCD() {
		CameraType camType = new CameraType();
		camType.addItem(new Samsung());
		return camType;
	}
}