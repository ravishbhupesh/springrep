package com.bot.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String greeting(Model model) {
		System.out.println("model : " + model);
		return "results";
	}

}