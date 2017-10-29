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
public class Slice extends Kind {

	private int duration;
	private List<Segment> segment;

	public Slice() {
	}

	public Slice(String kind, int duration) {
		super(kind);
		this.duration = duration;
		segment = new ArrayList<>();
	}

	public void addSegment(Segment segment) {
		this.segment.add(segment);
	}

	public int getDuration() {
		return duration;
	}

	public List<Segment> getSegment() {
		return segment;
	}

	@JsonProperty("duration")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@JsonProperty("segment")
	public void setSegment(List<Segment> segment) {
		this.segment = segment;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(",duration-" + getDuration());
		for (Segment s : getSegment()) {
			sb.append(",Segments-");
			sb.append("<<" + s.toString() + ">>");
		}
		return sb.toString();
	}

}
