package services;

import model.Event;
import model.Member;

public interface EventService {

	public void saveEvent(Event event);
	public Event getEventById(int id);
	public void addMemberToEvent(Member member, int eventID);
	public void removeMemberFromEvent(Member member,int eventID);
}
