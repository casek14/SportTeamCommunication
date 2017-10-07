package services;

import dao.MessageDao;
import model.Message;

public class MessageServiceImplementation implements MessageService{

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
