package com.rolyer.blog.service.blog;

import java.util.List;

import com.rolyer.blog.domain.CommentsDO;

public interface CommentService {
	public Integer insertComment(CommentsDO comment);
	public Integer deleteCommentById(Integer id);
	public Integer upadteCommentContentById(Integer id, String content);
	public List<CommentsDO> queryCommentByObjectId(Integer id);
}
