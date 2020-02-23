package com.tdchien88.designParrtens.type02_Structural.chap27_ProxyPattern;

/**
 * @author kyotran
 *
 */
public class RunMe {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
		access.grantInternetAccess();
	}

}
