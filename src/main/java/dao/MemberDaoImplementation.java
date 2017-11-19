package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
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
				List<Integer> list = new ArrayList<Integer>();
				member.setAdministrator(list);
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

	@Override
	public Member loginMember(Member member) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "From model.Member as m where m.email= :email and password= :password";
		try {
			Query query = session.createQuery(hql);
			query.setString("email", member.getEmail());
			query.setString("password", member.getPassword());
			member = (Member) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		return member;
	}

	/*
	 * Updatuje zaznam administrator v tabulce member
	 * V tomto sloupci jsou tymy ktere muze member managovat
	 * (non-Javadoc)
	 * @see dao.MemberDao#updateMemberAdministration(model.Member)
	 */
	@Override
	public void updateMemberAdministration(int memberID, int teamID) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String selectMember = "from model.Member as m where m.member_id = :id";
		
		try {
			Query q = session.createQuery(selectMember);
			q.setInteger("id", memberID);
			Member member = (Member) q.uniqueResult();
			member.getAdministrator().add(teamID);
			session.merge(member);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
	}

	@Override
	public Member updateMember(Member member) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String selectMember = "from model.Member as m where m.member_id = :id";
		try {
			Query q = session.createQuery(selectMember);
			q.setInteger("id", member.getMember_id());
			
			Member m = (Member) q.uniqueResult();
			
			//m.setAddress(member.getAddress());
			m.setDateOfBirth(member.getDateOfBirth());
			m.setFirstName(member.getFirstName());
			m.setLastName(member.getLastName());
			m.setFavouriteSports(member.getFavouriteSports());
			m.setPhoneNumber(member.getPhoneNumber());
			m.setPassword(member.getPassword());
			session.saveOrUpdate(m);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
		return member;
		
	}
	
	
	

}
