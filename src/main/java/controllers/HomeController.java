package controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controllers.HomeController;
import model.Address;
import model.Member;
import services.MemberService;


@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}
	
	@RequestMapping(value="/home/faq",method=RequestMethod.GET)
	public String showFaq(ModelMap model) {
		return "home/faq";
	}
	
	@RequestMapping(value="/home/about",method=RequestMethod.GET)
	public String showAbout(ModelMap model) {
		return "home/about";
	}
	
	@RequestMapping(value="/home/curses",method=RequestMethod.GET)
	public String showCurses(ModelMap model) {
		return "home/curses";
	}
	
	@RequestMapping(value="/home/trainers",method=RequestMethod.GET)
	public String showTrainers(ModelMap model) {
		return "home/trainers";
	}
	
	@RequestMapping(value="/home/trainings",method=RequestMethod.GET)
	public String showTrainings(ModelMap model) {
		return "home/trainings";
	}
}
