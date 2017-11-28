package com.sporttracker.app.web.dao;

import java.util.List;

import com.sporttracker.app.web.model.Event;
import com.sporttracker.app.web.model.Team;

public interface TeamDao {

	public void saveTeam(Team team);

	public List<Team> listAllTeams();

	public List<Team> getmemberTeams(List<Integer> teams);

	public Team getTeamById(int id);

	public Team updateTeam(Team team);

	public void addEventToTeam(int teamID, Event event);

}
