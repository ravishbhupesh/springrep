/**
 * 
 */
package com.bot.app.web.model.request.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.bot.app.web.model.TravelClass;
import com.bot.app.web.model.TravelType;

/**
 * @author bhupesh
 *
 */
public class RequestForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4028808423178988392L;

	@NotNull
	@Size(min = 3)
	private String fromD;
	@NotNull
	@Size(min = 3)
	private String toD;
	@NotNull
	private String depDt;
	@NotNull
	private String rtrnDt;
	@NotNull
	private String travelType = TravelType.RETURN.travelType();
	@NotNull
	private String travelClass = TravelClass.ECONOMY.travelClass();
	private boolean directFlightsOnly;
	private boolean refundable;
	private int adults = 1;
	private int children;
	private int infants;

	public String getFromD() {
		return fromD;
	}

	public void setFromD(String fromD) {
		this.fromD = fromD;
	}

	public String getToD() {
		return toD;
	}

	public void setToD(String toD) {
		this.toD = toD;
	}

	public String getDepDt() {
		return depDt;
	}

	public void setDepDt(String depDt) {
		this.depDt = depDt;
	}

	public String getRtrnDt() {
		return rtrnDt;
	}

	public void setRtrnDt(String rtrnDt) {
		this.rtrnDt = rtrnDt;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public boolean isDirectFlightsOnly() {
		return directFlightsOnly;
	}

	public void setDirectFlightsOnly(boolean directFlightsOnly) {
		this.directFlightsOnly = directFlightsOnly;
	}

	public boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public int getInfants() {
		return infants;
	}

	public void setInfants(int infants) {
		this.infants = infants;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("fromD : " + this.fromD + ":");
		sb.append("toD : " + this.toD + ":");
		sb.append("depDt : " + this.depDt + ":");
		sb.append("rtrnD : " + this.rtrnDt + ":");
		sb.append("travelType : " + this.travelType + ":");
		sb.append("travelClass : " + this.travelClass + ":");
		sb.append("directFlightsOnly : " + this.directFlightsOnly + ":");
		sb.append("refundable : " + this.refundable + ":");
		sb.append("adults : " + this.adults + ":");
		sb.append("children : " + this.children + ":");
		sb.append("infants : " + this.infants + ":");
		return sb.toString();
	}

}
