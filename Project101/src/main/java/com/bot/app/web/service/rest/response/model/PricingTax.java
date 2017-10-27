/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class PricingTax extends Kind {

	private String id;
	private String chargeType;
	private String code;
	private String country;
	private String salePrice;

	public PricingTax() {
	}

	public PricingTax(String kind) {
		super(kind);
	}

	public String getId() {
		return id;
	}

	public String getChargeType() {
		return chargeType;
	}

	public String getCode() {
		return code;
	}

	public String getCountry() {
		return country;
	}

	public String getSalePrice() {
		return salePrice;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("chargeType")
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("salePrice")
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
