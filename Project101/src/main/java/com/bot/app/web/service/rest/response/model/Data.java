/**
 * 
 */
package com.bot.app.web.service.rest.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RavishB
 *
 */
public abstract class Data extends Kind {

	private String code;
	private String name;
	private String id;

	public Data() {
	}

	public Data(String kind, String code, String name, String id) {
		super(kind);
		this.code = code;
		this.name = name;
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

}
