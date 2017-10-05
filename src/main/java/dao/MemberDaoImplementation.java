package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import model.Member;

public class MemberDaoImplementation implements MemberDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveMember(Member member) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(member != null) {
			try {
				session.save(member);
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
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getMembersOfTeam(int TeamID) {
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
