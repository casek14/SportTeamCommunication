package controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Member;
import model.Team;
import services.MemberService;
import services.TeamService;
import validation.TeamValidation;

@Controller
public class TeamController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TeamService teamService;
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/team/register",method=RequestMethod.GET)
	public String showRegisterTeamForm(ModelMap model, HttpSession session) {
		if(session.getAttribute("member") != null) {
			model.put("teamData", new Team());
			return "team/registerTeam";	
		}
		
		return "redirect:/member/login";
		
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
		
		
		Member clen = (Member) session.getAttribute("member");
		memberService.updateManagedTeams(clen.getMember_id(), team.getTeam_id());
		
		
		session.setAttribute("team", team);
		session.removeAttribute("member");
		clen.getAdministrator().add(team.getTeam_id());
		session.setAttribute("member", clen);
		return "team/registerSuccessful";
		
	}
	
	@RequestMapping(value="/team/list")
	public String listAllTeams(ModelMap model,HttpSession session) {
		List<Team> teams = teamService.getAllTeams();
		session.setAttribute("teams", teams);
		return "team/listOfTeams";
	}
	
	
	/**
	 * Return teams which can logged user manage (Can modify and so on)
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/team/list/admin")
	public String getAdminTeams(HttpSession session) {
		Member member = (Member) session.getAttribute("member");
		
		if(member != null) {
			
			List<Team> teams = teamService.getMemberTeams(member.getAdministrator());
			
			session.setAttribute("teams", teams);
			
			return "team/listMemberTeams";
		}
		
		
		return "redirect:/member/login";
	}
}
