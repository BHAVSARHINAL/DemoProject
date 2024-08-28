package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home page..");
		model.addAttribute("name", "QDev Technologies..");
		model.addAttribute("youtube", "learn coaading..");
		model.addAttribute("github", "https://github.com/BHAVSARHINAL?tab=repositories");

		return "Home";
	}

	//about page
	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("isLogedIn", false);
		return "about";
	}
	
	//service page..
	@RequestMapping("/services")
	public String servicePage() {
		return "service";
	}
	
}