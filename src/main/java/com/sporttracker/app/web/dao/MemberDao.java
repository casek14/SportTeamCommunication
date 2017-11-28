package com.sporttracker.app.web.dao;

import java.util.List;

import com.sporttracker.app.web.model.Member;

public interface MemberDao {

	/**
	 * Save member
	 * 
	 * @param member
	 */
	public void saveMember(Member member);

	public List<Member> getAllMembers();

	public List<Member> getMembersOfTeam(int TeamID);

	public Member loginMember(Member member);

	public void updateMemberAdministration(int memberID, int teamID);

	public Member updateMember(Member member);

}