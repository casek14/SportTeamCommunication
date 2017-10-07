package controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import controllers.HomeController;
import model.Address;
import model.Member;
import services.MemberService;


@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService memberService;
	
	Member member = new Member();
	Address address = new Address();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		member.setAdministrator(false);
		member.setEmail("jcach@gmail.com");
		member.setFavouriteSports("Fotbal, hokej, ping-pong");
		member.setFirstName("Jan");
		member.setLastName("Cach");
		member.setPassword("workshop");
		member.setPhoneNumber("721-875-199");
		
		address.setCity("Horni Jeleni");
		address.setCp("119");
		address.setPostCode("53374");
		address.setStreet("Rude armady");
		member.setAddress(address);
		
		memberService.saveMember(member);
		
		return "home";
	}
	
	
}
