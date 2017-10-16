package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import model.Team;

public class TeamDaoImplementation implements TeamDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveTeam(Team team) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(team != null) {
			try {
				session.save(team);
				tx.commit();
				session.close();
			} catch (Exception e) {
			    tx.rollback();
			    session.clear();
			    e.printStackTrace();
			}
		}
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
