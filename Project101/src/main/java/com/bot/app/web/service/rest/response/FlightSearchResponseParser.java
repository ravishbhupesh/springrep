/**
 * 
 */
package com.bot.app.web.service.rest.response;

import java.io.IOException;

import com.bot.app.web.service.rest.response.model.TripSearch;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RavishB
 *
 */
public class FlightSearchResponseParser {

	public TripSearch parser(String json) {
		ObjectMapper jsonObjectMapper = new ObjectMapper();
		try {
			return jsonObjectMapper.readValue(json.getBytes(), TripSearch.class);
		} catch (IOException e) {
			return null;
		}
	}
}
