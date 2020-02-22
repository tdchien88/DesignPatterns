package com.tdchien88.designParrtens.type01_Creational.chap11_FactoryMethodPattern;

public class GetPlanFactory {
	// use getPlan method to get object of type Plan
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new PlanDomestic();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new PlanCommercial();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new PlanInstitutional();
		}
		return null;
	}
}
