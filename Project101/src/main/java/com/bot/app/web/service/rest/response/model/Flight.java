/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Flight {

	private String carrier;
	private String number;

	public Flight() {
	}

	public Flight(String carrier, String number) {
		this.carrier = carrier;
		this.number = number;
	}

	public String getCarrier() {
		return carrier;
	}

	public String getNumber() {
		return number;
	}

	@JsonProperty("carrier")
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

}
