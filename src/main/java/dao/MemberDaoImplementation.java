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
		String getListOfTeams = "SELECT M.administrator from model.Member as M where M.member_id = :id";
		String hql = "UPDATE model.Member as m set m.administrator= :admin where m.member_id = :id";
		
		try {
			Query q1 = session.createQuery(getListOfTeams);
			q1.setInteger("id", memberID);
			List<Integer> listOfTeams = (List<Integer>) q1.uniqueResult();
			System.out.println(listOfTeams.toString());
			Query q2 = session.createQuery(hql);
			q2.setParameterList("admin", listOfTeams);
			q2.setInteger("id", memberID);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		
	}
	
	
	

}
