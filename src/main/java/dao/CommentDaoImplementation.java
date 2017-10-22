package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import model.Comment;
import model.Event;

public class CommentDaoImplementation implements CommentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveComment(Comment comment) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(comment != null) {
			try {
				session.save(comment);
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
