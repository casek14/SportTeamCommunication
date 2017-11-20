package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Event;
import model.Team;

public interface TeamDao {
	
	public void saveTeam(Team team);
	public List<Team> listAllTeams();
	public List<Team> getmemberTeams(List<Integer> teams);
	public Team getTeamById(int id);
	public Team updateTeam(Team team);
	public void addEventToTeam(int teamID, Event event);
	
}
