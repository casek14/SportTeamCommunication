package com.sporttracker.app.web.services;

import com.sporttracker.app.web.model.Member;

public interface MemberService {

	public void saveMember(Member member);

	public Member loginMember(Member member);

	public void updateManagedTeams(int memberID, int teamID);

	public Member updateMember(Member member);
}
