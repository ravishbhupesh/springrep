/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Fare extends Kind {

	private String id;
	private String carrier;
	private String origin;
	private String destination;
	private String basisCode;

	public Fare() {
	}

	public Fare(String kind, String id, String origin, String destination, String carrier, String basisCode) {
		super(kind);
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.carrier = carrier;
		this.basisCode = basisCode;
	}

	public String getId() {
		return id;
	}

	public String getCarrier() {
		return carrier;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getBasisCode() {
		return basisCode;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("carrier")
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	@JsonProperty("origin")
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@JsonProperty("destination")
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@JsonProperty("basisCode")
	public void setBasisCode(String basisCode) {
		this.basisCode = basisCode;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",Id-" + getId());
		sb.append(",Origin-" + getOrigin());
		sb.append(",Destination-" + getDestination());
		sb.append(",Carrier-" + getCarrier());
		sb.append(",BasisCode-" + getBasisCode());
		return sb.toString();
	}

}
