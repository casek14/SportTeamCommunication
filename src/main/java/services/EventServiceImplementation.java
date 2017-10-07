package services;

import dao.CommentDao;
import model.Comment;

public class EventServiceImplementation implements CommentService{

	private CommentDao commentDao;
	
	@Override
	public void saveComment(Comment comment) {
		commentDao.saveComment(comment);
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	

}
