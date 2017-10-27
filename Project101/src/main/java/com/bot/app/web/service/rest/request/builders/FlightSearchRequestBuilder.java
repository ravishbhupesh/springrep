/**
 * 
 */
package com.bot.app.web.service.rest.request.builders;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.bot.app.web.model.TravelType;
import com.bot.app.web.model.request.dto.RequestForm;
import com.bot.app.web.service.constants.SearchConstants;

/**
 * @author RavishB
 *
 */
public class FlightSearchRequestBuilder {

	public HttpHeaders buildHeaders(int contentLength) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setContentLength(contentLength);
		return headers;
	}

	public String buildPayload(RequestForm requestForm) {
		StringBuilder payload = new StringBuilder();
		// json request start
		payload.append("{");
		// request start
		payload.append("\"request\":{");
		// slice start
		payload.append("\"slice\": [");
		// Source -> Destination
		payload.append(createSlice(requestForm.getFromD(), requestForm.getToD(), requestForm.getDepDt(),
				requestForm.getTravelClass(), requestForm.isDirectFlightsOnly()));
		// If it's a round trip
		// Destination -> Source
		if (TravelType.RETURN.name().equals(requestForm.getTravelType())) {
			payload.append(",");
			payload.append(createSlice(requestForm.getToD(), requestForm.getFromD(), requestForm.getRtrnDt(),
					requestForm.getTravelClass(), requestForm.isDirectFlightsOnly()));
		}
		// slice end
		payload.append("],");
		// Passengers
		payload.append(
				createPassengers((requestForm.getAdults()), (requestForm.getChildren()), (requestForm.getInfants())));

		// number of options to return in result
		payload.append("\"solutions\": " + SearchConstants.NO_OF_SEARCH_RESULT + ",");
		// is the fare refundable
		payload.append("\"refundable\": " + requestForm.isRefundable());
		// request end
		payload.append("}");
		// json request end
		payload.append("}");
		return payload.toString();
	}

	private String createPassengers(int adults, int childern, int infants) {
		StringBuilder passengers = new StringBuilder();
		// passengers start
		passengers.append("\"passengers\": {");
		// adults
		passengers.append("\"adultCount\": " + adults + ",");
		// infants in lap
		passengers.append("\"infantInLapCount\": " + infants + ",");
		// infants in seat
		passengers.append("\"infantInSeatCount\": " + infants + ",");
		// childern count
		passengers.append("\"childCount\": " + childern + ",");
		// seniors
		passengers.append("\"seniorCount\": 0");
		// passengers end
		passengers.append("},");
		return passengers.toString();
	}

	private String createSlice(String fromD, String toD, String depDt, String travelClass, boolean directFlightsOnly) {
		StringBuilder slice = new StringBuilder();
		// slice body start
		slice.append("{");
		// origin
		slice.append("\"origin\": \"" + fromD + "\",");
		// destination
		slice.append("\"destination\": \"" + toD + "\",");
		// date
		slice.append("\"date\": \"" + depDt + "\",");
		// "maxStops": 0,
		if (directFlightsOnly)
			;
		slice.append("\"maxStops\": 0,");
		// cabin choice
		slice.append("\"preferredCabin\": \"" + travelClass + "\"");
		// slice body end
		slice.append("}");
		return slice.toString();
	}
}
