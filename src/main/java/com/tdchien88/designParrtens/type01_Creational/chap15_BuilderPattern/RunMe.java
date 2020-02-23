package com.tdchien88.designParrtens.type01_Creational.chap15_BuilderPattern;

public class RunMe {

	public static void main(String args[]) {
		CameraBuilder camBbuilder = new CameraBuilder();
		CameraType sam = camBbuilder.buildSonyCD();
		sam.showItems();

		CameraType sony = camBbuilder.buildSamsungCD();
		sony.showItems();
	}

}
