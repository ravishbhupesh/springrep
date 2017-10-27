/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Airport extends Data {

	public Airport() {
	}

	private String city;

	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

}
