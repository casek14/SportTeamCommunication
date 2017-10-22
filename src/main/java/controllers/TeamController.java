package controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Team;
import services.TeamService;
import validation.TeamValidation;

@Controller
public class TeamController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value="/team/register",method=RequestMethod.GET)
	public String showRegisterTeamForm(ModelMap model) {
		model.put("teamData", new Team());
		return "team/registerTeam";
	}
	
	
	@RequestMapping(value="/team/register",method=RequestMethod.POST)
	public String saveTeam(ModelMap model, @ModelAttribute("teamData") @Valid Team team,
			BindingResult br, HttpSession session) {
		TeamValidation teamValidation = new TeamValidation();
		teamValidation.validate(team, br);
		if(br.hasErrors()) {
			return "team/registerTeam";
		}
		
		teamService.saveTeam(team);
		session.setAttribute("team", team);
		return "team/registerSuccessful";
		
	}
}
