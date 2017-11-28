package com.sporttracker.app.web.services;

import org.springframework.stereotype.Component;

import com.sporttracker.app.web.dao.CommentDao;
import com.sporttracker.app.web.model.Comment;

@Component
public class CommentServiceImplementation implements CommentService {

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
