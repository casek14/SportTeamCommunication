package dao;

import java.util.List;

import model.Member;

public interface MemberDao {

	/**
	 * Save member
	 * @param member
	 */
	public void saveMember(Member member);
	public List<Member> getAllMembers();
	public List<Member> getMembersOfTeam(int TeamID);
	public Member loginMember(Member member);
	
}