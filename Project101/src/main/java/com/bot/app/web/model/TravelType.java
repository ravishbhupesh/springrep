package com.bot.app.web.model;

/**
 * 
 * @author bhupesh
 *
 */
public enum TravelType {

	ONE_WAY("oneway"), RETURN("return"), MULTI_CITY("multicity");

	private TravelType(String travelType) {
		this.travelType = travelType;
	}

	private String travelType;

	public String travelType() {
		return this.travelType;
	}
}
