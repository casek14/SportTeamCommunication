package services;

import dao.EventDao;
import model.Event;
import model.Member;

public class EventServiceImplementation implements EventService{

	private EventDao eventDao;
	
	@Override
	public void saveEvent(Event event) {
		eventDao.saveEvent(event);
	}

	public EventDao getEventDao() {
		return eventDao;
	}

	public void setEventDao(EventDao eventDao) {
		this.eventDao = eventDao;
	}

	@Override
	public Event getEventById(int id) {
		return eventDao.getEventById(id);
	}

	@Override
	public void addMemberToEvent(Member member, int eventID) {
		eventDao.addMemberToEvent(member, eventID);
	}

	@Override
	public void removeMemberFromEvent(Member member, int eventID) {
		eventDao.removeMemberFromEvent(member, eventID);
	}

	@Override
	public void deleteEvent(int eventID) {
		eventDao.deleteEvent(eventID);
	}

	

}
