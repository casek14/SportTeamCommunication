package services;

import dao.EventDao;
import model.Event;

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

	

}
