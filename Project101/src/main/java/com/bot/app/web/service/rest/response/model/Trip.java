/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Trip extends Kind implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6350846151034439139L;

	private String requestId;
	private TripData tripData;
	private List<TripOption> tripOptions;

	public Trip() {
	}

	public Trip(String kind, String requestId) {
		super(kind);
		this.requestId = requestId;
	}

	public String getRequestId() {
		return requestId;
	}

	public TripData getTripData() {
		return tripData;
	}

	@JsonProperty("requestId")
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@JsonProperty("data")
	public void setTripData(TripData tripData) {
		this.tripData = tripData;
	}

	public List<TripOption> getTripOptions() {
		return tripOptions;
	}

	@JsonProperty("tripOption")
	public void setTripOptions(List<TripOption> tripOptions) {
		this.tripOptions = tripOptions;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",requestId-" + getRequestId());
		sb.append(",tripData-" + tripData.toString());
		for (TripOption to : getTripOptions()) {
			sb.append(",TripOption-");
			sb.append("<<" + to.toString() + ">>");
		}
		return sb.toString();
	}

}
