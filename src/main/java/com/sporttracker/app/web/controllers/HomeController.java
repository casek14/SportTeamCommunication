package com.sporttracker.app.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping("/faq")
	public ModelAndView faq() {
		ModelAndView model = new ModelAndView("faq");
		return model;
	}

	@RequestMapping("/curses")
	public ModelAndView curses() {
		ModelAndView model = new ModelAndView("curses");
		return model;
	}

	@RequestMapping("/trainings")
	public ModelAndView trainings() {
		ModelAndView model = new ModelAndView("trainings");
		return model;
	}

	@RequestMapping("/trainers")
	public ModelAndView trainers() {
		ModelAndView model = new ModelAndView("trainings");
		return model;
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("about");
		return model;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}

}
