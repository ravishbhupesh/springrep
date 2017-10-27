/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class Segment extends Kind {

	private int duration;
	private String id;
	private String cabin;
	private String bookingCode;
	private int bookingCodeCount;
	private String marriedSegmentGroup;
	private List<Leg> leg;
	private Flight flight;

	public Segment() {
	}

	public Segment(String kind, String id) {
		super(kind);
		this.id = id;
		leg = new ArrayList<Leg>();
	}

	public void addLeg(Leg leg) {
		this.leg.add(leg);
	}

	public int getDuration() {
		return duration;
	}

	public String getId() {
		return id;
	}

	public String getCabin() {
		return cabin;
	}

	public String getBookingCode() {
		return bookingCode;
	}

	public int getBookingCodeCount() {
		return bookingCodeCount;
	}

	public String getMarriedSegmentGroup() {
		return marriedSegmentGroup;
	}

	public List<Leg> getLeg() {
		return leg;
	}

	public Flight getFlight() {
		return flight;
	}

	@JsonProperty("duration")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("cabin")
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	@JsonProperty("bookingCode")
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	@JsonProperty("bookingCodeCount")
	public void setBookingCodeCount(int bookingCodeCount) {
		this.bookingCodeCount = bookingCodeCount;
	}

	@JsonProperty("marriedSegmentGroup")
	public void setMarriedSegmentGroup(String marriedSegmentGroup) {
		this.marriedSegmentGroup = marriedSegmentGroup;
	}

	@JsonProperty("leg")
	public void setLeg(List<Leg> leg) {
		this.leg = leg;
	}

	@JsonProperty("flight")
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
