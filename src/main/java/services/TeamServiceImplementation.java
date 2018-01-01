package services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.TeamDao;
import model.Event;
import model.Team;

public class TeamServiceImplementation implements TeamService{

	
	private TeamDao teamDao;
	
	@Override
	public void saveTeam(Team team) {
	  teamDao.saveTeam(team);
	}

	public TeamDao getTeamDao() {
		return teamDao;
	}

	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}

	@Override
	public List<Team> getAllTeams() {
		return teamDao.listAllTeams();
	}

	@Override
	public List<Team> getMemberTeams(List<Integer> teams) {
		return teamDao.getmemberTeams(teams);
	}

	@Override
	public Team getTeamById(int id) {
		return teamDao.getTeamById(id);
	}

	@Override
	public Team updateTeam(Team team) {
		return teamDao.updateTeam(team);
	}

	@Override
	public void addEventToTeam(int teamID, Event event) {
		teamDao.addEventToTeam(teamID, event);
	}

	
	
	
	
}