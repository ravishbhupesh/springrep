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
public class TripOption extends Kind {

	private String id;
	private String saleTotal;
	private List<Slice> slice;
	private List<Pricing> pricing;

	public TripOption() {
	}

	public TripOption(String kind, String id, String saleTotal) {
		super(kind);
		this.id = id;
		this.saleTotal = saleTotal;
		this.slice = new ArrayList<>();
		this.pricing = new ArrayList<>();
	}

	public void addPricing(Pricing pricing) {
		this.pricing.add(pricing);
	}

	public void addSlice(Slice slice) {
		this.slice.add(slice);
	}

	public String getId() {
		return id;
	}

	public String getSaleTotal() {
		return saleTotal;
	}

	public List<Slice> getSlice() {
		return slice;
	}

	public List<Pricing> getPricing() {
		return pricing;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("saleTotal")
	public void setSaleTotal(String saleTotal) {
		this.saleTotal = saleTotal;
	}

	@JsonProperty("slice")
	public void setSlice(List<Slice> slice) {
		this.slice = slice;
	}

	@JsonProperty("pricing")
	public void setPricing(List<Pricing> pricing) {
		this.pricing = pricing;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",id-" + getId());
		sb.append(",saleTotal-" + getSaleTotal());
		for (Slice s : getSlice()) {
			sb.append(",slice-");
			sb.append("<<" + s.toString() + ">>");
		}
		for (Pricing p : getPricing()) {
			sb.append(",pricing-");
			sb.append("<<" + p.toString() + ">>");
		}
		return sb.toString();
	}

}
