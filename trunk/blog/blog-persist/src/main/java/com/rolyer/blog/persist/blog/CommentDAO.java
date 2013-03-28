package com.rolyer.blog.persist.blog;

import java.util.List;

import com.rolyer.blog.domain.CommentsDO;

public interface CommentDAO {
	public Integer insertComment(CommentsDO comment);
	public Integer deleteCommentById(Integer id);
	public Integer upadteCommentContentById(Integer id, String content);
	public List<CommentsDO> queryCommentByObjectId(Integer id);
}
