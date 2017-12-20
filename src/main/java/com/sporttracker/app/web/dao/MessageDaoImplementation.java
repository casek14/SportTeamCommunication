package com.sporttracker.app.web.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.sporttracker.app.web.model.Message;

@Repository
@Transactional
public class MessageDaoImplementation implements MessageDao {

	private SessionFactory sessionFactory;

	@Override
	public void saveMessage(Message message) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if (message != null) {
			try {
				session.save(message);
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
