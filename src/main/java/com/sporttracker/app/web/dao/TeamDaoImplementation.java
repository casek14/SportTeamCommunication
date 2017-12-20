package com.sporttracker.app.web.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sporttracker.app.web.model.Event;
import com.sporttracker.app.web.model.Team;

@Repository
@Transactional
public class TeamDaoImplementation implements TeamDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveTeam(Team team) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if (team != null) {
			try {
				session.save(team);
				session.flush();
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.clear();
				e.printStackTrace();
			}
		}
	}

	/*
	 * Get list of all teams
	 * 
	 * @see dao.TeamDao#listAllTeams()
	 */

	@Override
	public List<Team> listAllTeams() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Team";
		List<Team> teams = new ArrayList<Team>();

		try {
			Query q = session.createQuery(hql);
			teams = q.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}

		return teams;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Team> getmemberTeams(List<Integer> teams) {

		Session session = sessionFactory.openSession();
		session.setCacheMode(CacheMode.IGNORE);
		Transaction tx = session.beginTransaction();
		String hql = "from model.Team where team_id in :teams";

		List<Team> selectedTeams = new ArrayList<Team>();

		try {
			Query q = session.createQuery(hql);
			q.setParameterList("teams", teams);
			selectedTeams = q.list();

			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return selectedTeams;
	}

	@Override
	public Team getTeamById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Team where team_id= :id";
		Team t = new Team();

		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", id);
			t = (Team) q.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}

		return t;
	}

	@Override
	public Team updateTeam(Team team) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Team where team_id = :id";
		Team t = new Team();
		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", team.getTeam_id());
			t = (Team) q.uniqueResult();
			t.setName(team.getName());
			t.setDescription(team.getDescription());
			session.saveOrUpdate(t);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public void addEventToTeam(int teamID, Event event) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Team where team_id = :id";

		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", teamID);
			Team t = (Team) q.uniqueResult();
			t.getEvents().add(event);
			session.saveOrUpdate(t);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}

}
