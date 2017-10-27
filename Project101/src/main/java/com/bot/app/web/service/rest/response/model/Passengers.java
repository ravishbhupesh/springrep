/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Passengers extends Kind {

	private int adultCount;
	private int childCount;

	public Passengers() {
	}

	public Passengers(String kind) {
		super(kind);
	}

	public int getAdultCount() {
		return adultCount;
	}

	public int getChildCount() {
		return childCount;
	}

	@JsonProperty("adultCount")
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}

	@JsonProperty("childCount")
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

}
