package dao;

import java.util.List;

import model.Event;
import model.Member;

public interface EventDao {

	public void saveEvent(Event event);
	public Event getEventById(int id);
	public void addMemberToEvent(Member member,int eventID);
	public void removeMemberFromEvent(Member member, int eventID);
	public void deleteEvent(int eventID);
	
}
