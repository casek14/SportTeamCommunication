package com.sporttracker.app.web.services;

import org.springframework.stereotype.Component;

import com.sporttracker.app.web.dao.MessageDao;
import com.sporttracker.app.web.model.Message;

@Component
public class MessageServiceImplementation implements MessageService {

	private MessageDao messageDao;

	@Override
	public void saveMessage(Message message) {
		messageDao.saveMessage(message);
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

}
