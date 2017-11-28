package com.sporttracker.app.web.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sporttracker.app.web.model.Member;
import com.sporttracker.app.web.model.Team;
import com.sporttracker.app.web.services.MemberService;
import com.sporttracker.app.web.services.TeamService;
import com.sporttracker.app.web.validation.TeamValidation;

@Controller
public class TeamController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private TeamService teamService;

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/team/register", method = RequestMethod.GET)
	public String showRegisterTeamForm(ModelMap model, HttpSession session) {
		if (session.getAttribute("member") != null) {
			model.put("teamData", new Team());
			return "team/registerTeam";
		}

		return "redirect:/member/login";

	}

	@RequestMapping(value = "/team/register", method = RequestMethod.POST)
	public String saveTeam(ModelMap model, @ModelAttribute("teamData") @Valid Team team, BindingResult br,
			HttpSession session) {
		TeamValidation teamValidation = new TeamValidation();
		teamValidation.validate(team, br);
		if (br.hasErrors()) {
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

	@RequestMapping(value = "/team/list")
	public String listAllTeams(ModelMap model, HttpSession session) {
		List<Team> teams = teamService.getAllTeams();
		session.setAttribute("teams", teams);
		return "team/listOfTeams";
	}

	/**
	 * Return teams which can logged user manage (Can modify and so on)
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/team/list/admin")
	public String getAdminTeams(HttpSession session) {
		Member member = (Member) session.getAttribute("member");

		if (member != null) {

			List<Team> teams = teamService.getMemberTeams(member.getAdministrator());

			session.setAttribute("teams", teams);

			return "team/listMemberTeams";
		}

		return "redirect:/member/login";
	}

	@RequestMapping(value = "/team/detail/{teamID}")
	public String returnTeamDetail(@PathVariable(value = "teamID") final int id, HttpSession session, ModelMap model) {

		boolean admin = false;
		List<Team> teams = (List<Team>) session.getAttribute("teams");
		Team t = teamService.getTeamById(id);

		session.setAttribute("team", t);
		Member m = (Member) session.getAttribute("member");
		List<Integer> list = m.getAdministrator();
		model.put("teamData", new Team());

		if (m != null && list.contains(t.getTeam_id())) {
			admin = true;

		}

		session.setAttribute("admin", admin);
		return "team/detail";
	}

	@RequestMapping(value = "/team/manage/{teamID}", method = RequestMethod.GET)
	public String manageTeam(@PathVariable(value = "teamID") final int id, HttpSession session, ModelMap model) {

		Member m = (Member) session.getAttribute("member");
		if (m == null) {
			return "member/loginMember";
		}

		Team t = teamService.getTeamById(id);
		model.put("teamData", t);
		session.setAttribute("team", t);

		if (m.getAdministrator().contains(t.getTeam_id())) {
			model.addAttribute("id", t.getTeam_id());
			return "team/updateTeam";
		}

		return "deny";
	}

	@RequestMapping(value = "/team/manage/{teamID}", method = RequestMethod.POST)
	public String doUpdateTeamInfo(@PathVariable(value = "teamID") final int id, HttpSession session,
			@ModelAttribute("teamData") @Valid Team team, BindingResult br) {

		TeamValidation teamValidation = new TeamValidation();
		teamValidation.validate(team, br);
		if (br.hasErrors()) {
			return "team/updateTeam";
		}

		Member m = (Member) session.getAttribute("member");

		if (m.getAdministrator().contains(team.getTeam_id())) {
			Team updatedTeam = teamService.updateTeam(team);
			session.removeAttribute("team");
			session.setAttribute("team", updatedTeam);
			return "team/updateSuccessful";
		}

		return "deny";
	}

}
