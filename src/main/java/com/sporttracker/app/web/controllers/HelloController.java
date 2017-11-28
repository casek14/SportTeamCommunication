package com.sporttracker.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hovno")
	public ModelAndView hovno() {
		ModelAndView model = new ModelAndView("hovno");
		return model;
	}

}
