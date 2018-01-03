package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.event.spi.SaveOrUpdateEvent;

import model.Event;
import model.Member;

public class EventDaoImplementation implements EventDao{

	
	private SessionFactory sessionFactory;
	
	@Override
	public void saveEvent(Event event) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(event != null) {
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

	@Override
	public Event getEventById(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Event as e where e.event_id = :id";
		Event event = new Event();
		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", id);
			event = (Event) q.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		return event;
	}

	@Override
	public void addMemberToEvent(Member member,int eventID) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Event as e where e.event_id = :id";
		Event event = new Event();
		if(event.getLoggedUsers().isEmpty()) {
			event.setLoggedUsers(new ArrayList<Member>());
		}
		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", eventID);
			event = (Event) q.uniqueResult();
			
		if(! isMemberAlreadyLogged(event.getLoggedUsers(), member)) {
			event.getLoggedUsers().add(member);
			
		}
			session.saveOrUpdate(event);
			tx.commit();
			session.close();
			
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}

	/*
	 * Metoda vrati true pokud je uzivatel jiz na udalost prihlaseny
	 * jinak vraci false
	 */
	private boolean isMemberAlreadyLogged(List<Member> members,Member member) {
		
		for(Member m : members) {
			if(m.getMember_id() == member.getMember_id()) return true;
		}
		
		return false;
	}

	@Override
	public void removeMemberFromEvent(Member member, int eventID) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from model.Event as e where e.event_id = :id";
		Event event = new Event();
		
		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", eventID);
			event = (Event) q.uniqueResult();
			
		if(isMemberAlreadyLogged(event.getLoggedUsers(), member)) {

			Iterator<Member> it = event.getLoggedUsers().iterator();
			while (it.hasNext()) {
				Member m = it.next();
				if (m.getMember_id() == (member.getMember_id())) {
					it.remove();
				}
			}


		}
			session.saveOrUpdate(event);
			tx.commit();
			session.close();
			
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEvent(int eventID) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from model.Event as e where e.event_id = :id";
		
		try {
			Query q = session.createQuery(hql);
			q.setInteger("id", eventID);
			q.executeUpdate();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
	}
	
}
