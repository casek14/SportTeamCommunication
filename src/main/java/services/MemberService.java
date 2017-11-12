package services;

import model.Member;

public interface MemberService {

	public void saveMember(Member member);
	public Member loginMember(Member member);
	
}
