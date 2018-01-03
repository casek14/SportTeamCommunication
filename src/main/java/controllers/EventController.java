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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Event;
import model.Member;
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
		
		
		eventService.saveEvent(event);
		teamService.addEventToTeam(t.getTeam_id(), event);
		session.setAttribute("event", event);
		t.getEvents().add(event);
		session.removeAttribute("team");
		session.setAttribute("team", t);
		return "event/creationSuccessful";
	}
	
	@RequestMapping(value="/event/detail/{id}")
	public String showEventDetail(@PathVariable(value="id") final int id, HttpSession session ) {
		Member member = (Member) session.getAttribute("member");
		if(member == null) {
	    	return "member/loginMember";
	    }
		
		Event e = (Event) eventService.getEventById(id);
		if(e == null) return "notFound";
		session.removeAttribute("event");
		session.setAttribute("event", e);
		
		return "event/eventDetail";
	}
	
	/**
	 * Pihlaseni uzivatele na konkretni udalost
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/event/attend/{id}")
	public String attendEvent(@PathVariable(value="id") final int id,  HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if(member == null) {
	    	return "member/loginMember";
	    }
		
		eventService.addMemberToEvent(member, id);
		session.removeAttribute("event");
		Event e = eventService.getEventById(id);
		if(e == null) return "notFound";
		
		session.setAttribute("event", e);
		return "redirect:/event/detail/"+e.getEvent_id();
	}
	
	/**
	 * Odhlaseni uzivatele z konkretni udalosti
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/event/notattend/{id}")
	public String notattendEvent(@PathVariable(value="id") final int id,  HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if(member == null) {
	    	return "member/loginMember";
	    }
		
		eventService.removeMemberFromEvent(member, id);
		session.removeAttribute("event");
		Event e = eventService.getEventById(id);
		if(e == null) return "notFound";
		
		session.setAttribute("event", e);
		System.out.println("Pocet memberu je: "+e.getLoggedUsers().toString());
		return "redirect:/event/detail/"+e.getEvent_id();
	}
	
	/**
	 * Smazani udalosti
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/event/delete/{teamID}/{id}")
	public String deleteEvent(@PathVariable(value="id") final int id, 
			                  @PathVariable(value="teamID") final int teamID,
			                  HttpSession session) {
		
		Member member = (Member) session.getAttribute("member");
		if(member == null) {
	    	return "member/loginMember";
	    }
		
		teamService.removeEventFromTeam(teamID, id);
		eventService.deleteEvent(id);
		
		return "redirect:/team/list";
	}
	
}
