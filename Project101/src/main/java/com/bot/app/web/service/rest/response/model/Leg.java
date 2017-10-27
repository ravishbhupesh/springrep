/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Leg extends Kind {

	private String id;
	private String aircraft;
	private String arrivalTime;
	private String departureTime;
	private String origin;
	private String destination;
	private String destinationTerminal;
	private int duration;
	private int mileage;
	private String meal;

	public Leg() {
	}

	public Leg(String kind, String id, String origin, String destination, String arrivalTime, String departureTime) {
		super(kind);
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public String getId() {
		return id;
	}

	public String getAircraft() {
		return aircraft;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getDestinationTerminal() {
		return destinationTerminal;
	}

	public int getDuration() {
		return duration;
	}

	public int getMileage() {
		return mileage;
	}

	public String getMeal() {
		return meal;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("aircraft")
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	@JsonProperty("arrivalTime")
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@JsonProperty("departureTime")
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@JsonProperty("origin")
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@JsonProperty("destination")
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@JsonProperty("destinationTerminal")
	public void setDestinationTerminal(String destinationTerminal) {
		this.destinationTerminal = destinationTerminal;
	}

	@JsonProperty("duration")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@JsonProperty("mileage")
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@JsonProperty("meal")
	public void setMeal(String meal) {
		this.meal = meal;
	}

}
