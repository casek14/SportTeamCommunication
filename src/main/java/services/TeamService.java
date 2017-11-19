package services;

import java.util.List;

import model.Team;

public interface TeamService {

	
	public void saveTeam(Team team);
	public List<Team> getAllTeams();
	public List<Team> getMemberTeams(List<Integer> teams);
	public Team getTeamById(int id);
	public Team updateTeam(Team team);
}
