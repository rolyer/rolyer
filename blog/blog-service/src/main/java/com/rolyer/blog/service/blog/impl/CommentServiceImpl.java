package com.rolyer.blog.service.blog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rolyer.blog.domain.CommentsDO;
import com.rolyer.blog.persist.blog.CommentDAO;
import com.rolyer.blog.service.blog.CommentService;

@Component("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDAO commentDAO;
	
	public Integer insertComment(CommentsDO comment) {
		return commentDAO.insertComment(comment);
	}

	public Integer deleteCommentById(Integer id) {
		return commentDAO.deleteCommentById(id);
	}

	public Integer upadteCommentContentById(Integer id, String content) {
		return commentDAO.deleteCommentById(id);
	}

	public List<CommentsDO> queryCommentByObjectId(Integer id) {
		return commentDAO.queryCommentByObjectId(id);
	}

}
