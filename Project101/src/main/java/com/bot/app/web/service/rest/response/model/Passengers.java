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
	private int infantInSeatCount;
	private int infantInLapCount;

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

	public int getInfantInSeatCount() {
		return infantInSeatCount;
	}

	public int getInfantInLapCount() {
		return infantInLapCount;
	}

	@JsonProperty("infantInLapCount")
	public void setInfantInLapCount(int infantInLapCount) {
		this.infantInLapCount = infantInLapCount;
	}

	@JsonProperty("infantInSeatCount")
	public void setInfantInSeatCount(int infantInSeatCount) {
		this.infantInSeatCount = infantInSeatCount;
	}

	@JsonProperty("adultCount")
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}

	@JsonProperty("childCount")
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",AdultCount-" + getAdultCount());
		sb.append(",ChildCount-" + getChildCount());
		sb.append(",InfantInSeatCount-" + getInfantInSeatCount());
		sb.append(",InfantInLapCount-" + getInfantInLapCount());
		return sb.toString();
	}

}
