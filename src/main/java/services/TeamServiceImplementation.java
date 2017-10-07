package services;

import dao.TeamDao;
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

	
	
	
	
}
