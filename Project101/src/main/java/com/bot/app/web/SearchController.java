package com.bot.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bot.app.web.model.request.dto.RequestForm;

@Controller
public class SearchController {

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
	public String search(@ModelAttribute RequestForm request) {
		System.out.println("request:" + request);
		return "results";
	}

}