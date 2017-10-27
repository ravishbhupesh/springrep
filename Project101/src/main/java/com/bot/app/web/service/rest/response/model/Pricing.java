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
public class Pricing extends Kind {

	private String baseFareTotal;
	private String saleFareTotal;
	private String saleTaxTotal;
	private String saleTotal;
	private String fareCalculation;
	private String latestTicketingTime;
	private String ptc;
	private List<Fare> fare;
	private List<SegmentPricing> segmentPricing;
	private Passengers passengers;
	private List<PricingTax> tax;

	public Pricing() {
	}

	public Pricing(String kind) {
		super(kind);
		fare = new ArrayList<>();
		segmentPricing = new ArrayList<>();
		tax = new ArrayList<>();
	}

	public void addTax(PricingTax pricingTax) {
		this.tax.add(pricingTax);
	}

	public void addSegmentPricing(SegmentPricing segmentPricing) {
		this.segmentPricing.add(segmentPricing);
	}

	public void addFare(Fare fare) {
		this.fare.add(fare);
	}

	public String getBaseFareTotal() {
		return baseFareTotal;
	}

	public String getSaleFareTotal() {
		return saleFareTotal;
	}

	public String getSaleTaxTotal() {
		return saleTaxTotal;
	}

	public String getSaleTotal() {
		return saleTotal;
	}

	public String getFareCalculation() {
		return fareCalculation;
	}

	public String getLatestTicketingTime() {
		return latestTicketingTime;
	}

	public String getPtc() {
		return ptc;
	}

	public List<Fare> getFare() {
		return fare;
	}

	public List<SegmentPricing> getSegmentPricing() {
		return segmentPricing;
	}

	public Passengers getPassengers() {
		return passengers;
	}

	@JsonProperty("tax")
	public List<PricingTax> getTax() {
		return tax;
	}

	@JsonProperty("baseFareTotal")
	public void setBaseFareTotal(String baseFareTotal) {
		this.baseFareTotal = baseFareTotal;
	}

	@JsonProperty("saleFareTotal")
	public void setSaleFareTotal(String saleFareTotal) {
		this.saleFareTotal = saleFareTotal;
	}

	@JsonProperty("saleTaxTotal")
	public void setSaleTaxTotal(String saleTaxTotal) {
		this.saleTaxTotal = saleTaxTotal;
	}

	@JsonProperty("saleTotal")
	public void setSaleTotal(String saleTotal) {
		this.saleTotal = saleTotal;
	}

	@JsonProperty("fareCalculation")
	public void setFareCalculation(String fareCalculation) {
		this.fareCalculation = fareCalculation;
	}

	@JsonProperty("latestTicketingTime")
	public void setLatestTicketingTime(String latestTicketingTime) {
		this.latestTicketingTime = latestTicketingTime;
	}

	@JsonProperty("ptc")
	public void setPtc(String ptc) {
		this.ptc = ptc;
	}

	@JsonProperty("fare")
	public void setFare(List<Fare> fare) {
		this.fare = fare;
	}

	@JsonProperty("segmentPricing")
	public void setSegmentPricing(List<SegmentPricing> segmentPricing) {
		this.segmentPricing = segmentPricing;
	}

	@JsonProperty("passengers")
	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}

	@JsonProperty("tax")
	public void setTax(List<PricingTax> tax) {
		this.tax = tax;
	}

}
