package com.sporttracker.app.web.services;

import org.springframework.stereotype.Component;

import com.sporttracker.app.web.dao.EventDao;
import com.sporttracker.app.web.model.Event;

@Component
public class EventServiceImplementation implements EventService {

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
