package services;

import dao.MemberDao;
import model.Member;

public class MemberServiceImplementation implements MemberService{

	private MemberDao memberDao;
	
	@Override
	public void saveMember(Member member) {
      
		memberDao.saveMember(member);
	
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public Member loginMember(Member member) {
		return memberDao.loginMember(member);
	}

	@Override
	public void updateManagedTeams(int memberID, int teamID) {
		memberDao.updateMemberAdministration(memberID, teamID);
	}

	
	
}
