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
public class TripData extends Kind {

	private List<Airport> airport;
	private List<City> city;
	private List<Aircraft> aircraft;
	private List<Tax> tax;
	private List<Carrier> carrier;

	public TripData() {
	}

	public TripData(String kind) {
		super(kind);
		airport = new ArrayList<>();
		city = new ArrayList<>();
		aircraft = new ArrayList<>();
		tax = new ArrayList<>();
		carrier = new ArrayList<>();
	}

	public void addAirport(Airport airport) {
		this.airport.add(airport);
	}

	public void addCity(City city) {
		this.city.add(city);
	}

	public void addAircraft(Aircraft aircraft) {
		this.aircraft.add(aircraft);
	}

	public void addTax(Tax tax) {
		this.tax.add(tax);
	}

	public void addCarrier(Carrier carrier) {
		this.carrier.add(carrier);
	}

	public List<Airport> getAirport() {
		return airport;
	}

	public List<City> getCitie() {
		return city;
	}

	public List<Aircraft> getAircraft() {
		return aircraft;
	}

	public List<Tax> getTax() {
		return tax;
	}

	public List<Carrier> getCarrier() {
		return carrier;
	}

	@JsonProperty("airport")
	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}

	@JsonProperty("city")
	public void setCity(List<City> city) {
		this.city = city;
	}

	@JsonProperty("aircraft")
	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}

	@JsonProperty("tax")
	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}

	@JsonProperty("carrier")
	public void setCarrier(List<Carrier> carrier) {
		this.carrier = carrier;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		for (Airport a : getAirport()) {
			sb.append(",airport-");
			sb.append("<<" + a.toString() + ">>");
		}
		for (City c : getCitie()) {
			sb.append(",city-");
			sb.append("<<" + c.toString() + ">>");
		}
		for (Aircraft a : getAircraft()) {
			sb.append(",aircraft-");
			sb.append("<<" + a.toString() + ">>");
		}
		for (Tax t : getTax()) {
			sb.append(",tax-");
			sb.append("<<" + t.toString() + ">>");
		}
		for (Carrier c : getCarrier()) {
			sb.append(",carrier-");
			sb.append("<<" + c.toString() + ">>");
		}
		return sb.toString();
	}

}
