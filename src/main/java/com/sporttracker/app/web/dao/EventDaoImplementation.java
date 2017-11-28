package com.sporttracker.app.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sporttracker.app.web.model.Event;

public class EventDaoImplementation implements EventDao {

	private SessionFactory sessionFactory;

	@Override
	public void saveEvent(Event event) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if (event != null) {
			try {
				session.save(event);
				tx.commit();
				session.close();
			} catch (Exception e) {
				tx.rollback();
				session.clear();
				e.printStackTrace();
			}
		}

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
