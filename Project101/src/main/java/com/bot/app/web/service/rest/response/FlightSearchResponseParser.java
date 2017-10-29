/**
 * 
 */
package com.bot.app.web.service.rest.response;

import java.io.IOException;

import com.bot.app.web.service.rest.response.model.TripSearch;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RavishB
 *
 */
public class FlightSearchResponseParser {

	public TripSearch parser(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper jsonObjectMapper = new ObjectMapper();
		System.out.println("Parsing response....");
		return jsonObjectMapper.readValue(json.getBytes(), TripSearch.class);
	}
}
