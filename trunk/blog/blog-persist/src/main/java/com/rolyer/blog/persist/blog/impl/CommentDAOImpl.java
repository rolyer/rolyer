package com.rolyer.blog.persist.blog.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;

import com.rolyer.blog.domain.blog.CommentsDO;
import com.rolyer.blog.persist.blog.CommentDAO;

@Component("commentDAO")
public class CommentDAOImpl extends SqlMapClientDaoSupport implements CommentDAO {

	public Integer insertComment(CommentsDO comment) {
		return (Integer) getSqlMapClientTemplate().insert("sqlMapComment.insertComment", comment);
	}

	public Integer deleteCommentById(Integer id) {
		return getSqlMapClientTemplate().delete("sqlMapComment.deleteCommentById", id);
	}

	public Integer upadteCommentContentById(Integer id, String content) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		param.put("content", content);
		return getSqlMapClientTemplate().update("sqlMapComment.upadteCommentContentById", param);
	}

	@SuppressWarnings("unchecked")
	public List<CommentsDO> queryCommentByObjectId(Integer id) {
		return getSqlMapClientTemplate().queryForList("sqlMapComment.queryCommentByObjectId", id);
	}
}
