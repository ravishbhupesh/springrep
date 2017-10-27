package com.bot.app.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.bot.app.web.model.request.dto.RequestForm;
import com.bot.app.web.service.rest.request.builders.FlightSearchRequestBuilder;
import com.bot.app.web.service.rest.response.FlightSearchResponseParser;
import com.bot.app.web.service.rest.response.model.TripSearch;

@Controller
public class FlightSearchController {

	private RestTemplate restTemplate = new RestTemplate();

	private final FlightSearchRequestBuilder requestBuilder = new FlightSearchRequestBuilder();
	private final FlightSearchResponseParser responseParser = new FlightSearchResponseParser();

	@RequestMapping("/search")
	public String greeting(Model model) {
		System.out.println("model : " + model);
		return "results";
	}

	@GetMapping("/")
	public String getSearchForm(Model model) {
		model.addAttribute("searchRequest", new RequestForm());
		return "index";
	}

	@PostMapping("/search")
	public String search(Model model, @ModelAttribute RequestForm request) throws IOException {
		System.out.println("request:" + request);
		String jsonRequestPayload = requestBuilder.buildPayload(request);
		System.out.println(jsonRequestPayload);
		HttpEntity<String> req = new HttpEntity<String>(jsonRequestPayload,
				requestBuilder.buildHeaders(jsonRequestPayload.length()));
		// ResponseEntity<String> response =
		// restTemplate.postForEntity(SearchConstants.URL, req, String.class);
		// System.out.println(response);
		// System.out.println(response.getHeaders());
		// System.out.println(response.getStatusCode());
		// System.out.println(response.getStatusCodeValue());
		// System.out.println(response.getBody());
		String jsonResponse = new String(Files.readAllBytes(Paths.get("C:/jsonResponse.txt")));
		TripSearch tripSearch = responseParser.parser(jsonResponse);
		model.addAttribute("tripSearch", tripSearch);
		return "results";
	}

}