/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public class SegmentPricing extends Kind {

	private String fareId;
	private String segmentId;

	public SegmentPricing() {
	}

	public SegmentPricing(String kind, String fareId, String segmentId) {
		super(kind);
		this.fareId = fareId;
		this.segmentId = segmentId;
	}

	public String getFareId() {
		return fareId;
	}

	public String getSegmentId() {
		return segmentId;
	}

	@JsonProperty("fareId")
	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	@JsonProperty("segmentId")
	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

}
