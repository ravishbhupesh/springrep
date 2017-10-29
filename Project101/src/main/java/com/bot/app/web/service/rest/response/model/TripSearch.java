/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class TripSearch extends Kind implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -325710840002601949L;
	private Trip trips;

	public TripSearch() {
	}

	public TripSearch(String kind) {
		super(kind);
	}

	public Trip getTrips() {
		return trips;
	}

	@JsonProperty("trips")
	public void setTrips(Trip trips) {
		this.trips = trips;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",trips-" + getTrips().toString());
		return sb.toString();
	}

}
