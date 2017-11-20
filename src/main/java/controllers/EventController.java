package controllers;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Event;
import model.Team;
import services.EventService;
import services.TeamService;
import validation.EventValidation;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value="/event/create",method=RequestMethod.GET)
	public String createNewEvent(ModelMap model, HttpSession session) {
		
		Team t = (Team)session.getAttribute("team");
		if(t != null) {
		model.put("eventData", new Event());
		return "event/createEvent";
		}
		
		return "redirect:/team/list";
	}
	
	@RequestMapping(value="/event/create",method=RequestMethod.POST)
	public String doCreateEvent(ModelMap model, HttpSession session,
			@ModelAttribute("eventData") @Valid Event event,
			BindingResult br) {
		Team t = (Team) session.getAttribute("team");
		if(t == null) {
			return "redirect:/team/list";
		}
		
		EventValidation eventValidation = new EventValidation();
		eventValidation.validate(event, br);
		if(br.hasErrors()) {
			return "event/createEvent";
		}
		
		Date date = new Date();
		String format = "HH:mm-dd/MM/yyyy";
		DateFormat dateFormat = new SimpleDateFormat(format);
		String formatedDate = dateFormat.format(date);
		System.out.println("Time format je: "+formatedDate);
		event.setDate(formatedDate);
		eventService.saveEvent(event);
		teamService.addEventToTeam(t.getTeam_id(), event);
		session.setAttribute("event", event);
		t.getEvents().add(event);
		session.removeAttribute("team");
		session.setAttribute("team", t);
		return "event/creationSuccessful";
	}
	
}
