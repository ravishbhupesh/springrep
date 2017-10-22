package com.bot.app.web.model;

/**
 * 
 * @author bhupesh
 *
 */
public enum TravelClass {

	ECONOMY("economy"), BUSINESS("business"), FIRST_CLASS("firstclass");

	private TravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	private String travelClass;

	public String travelClass() {
		return this.travelClass;
	}
}
