package com.sporttracker.app.web.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sporttracker.app.web.model.Event;
import com.sporttracker.app.web.model.Team;
import com.sporttracker.app.web.services.EventService;
import com.sporttracker.app.web.services.TeamService;
import com.sporttracker.app.web.validation.EventValidation;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "/event/create", method = RequestMethod.GET)
	public String createNewEvent(ModelMap model, HttpSession session) {

		Team t = (Team) session.getAttribute("team");
		if (t != null) {
			model.put("eventData", new Event());
			return "event/createEvent";
		}

		return "redirect:/team/list";
	}

	@RequestMapping(value = "/event/create", method = RequestMethod.POST)
	public String doCreateEvent(ModelMap model, HttpSession session, @ModelAttribute("eventData") @Valid Event event,
			BindingResult br) {
		Team t = (Team) session.getAttribute("team");
		if (t == null) {
			return "redirect:/team/list";
		}

		EventValidation eventValidation = new EventValidation();
		eventValidation.validate(event, br);
		if (br.hasErrors()) {
			return "event/createEvent";
		}

		eventService.saveEvent(event);
		teamService.addEventToTeam(t.getTeam_id(), event);
		session.setAttribute("event", event);
		t.getEvents().add(event);
		session.removeAttribute("team");
		session.setAttribute("team", t);
		return "event/creationSuccessful";
	}

}
