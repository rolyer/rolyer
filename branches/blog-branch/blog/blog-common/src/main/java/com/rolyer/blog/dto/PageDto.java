/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-11
 */
package com.rolyer.blog.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rolyer (rolyer.live@gmail.com)<br/>
 * 用于Ext表格分页时返回的数据信息<br/>
 * <strong>格式</strong>:
 * {"pageSize":20,"recoresReturned":100,"totalRecords":100,"startIndex":0,"sort":"id","dir":"asc",
 * records:[]}
 */
public class PageDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final static int DEFAULT_SIZE		= 20;			//默认每页显示记录数
	final static String DEFAULT_DIR		= "asc";		//默认排序方式

	private Integer recordsReturned;  					//返回到页面的数据量
	private Integer totalRecords;  						//总数据数
	private Integer startIndex;  						//页首
	private String sort;  								//排序字段
	private String dir; 								//desc or asc
	private Integer pageSize;  							//分页大小
	private Integer totalPages;        					//总页数，通过计算获得，不能直接赋值

	@SuppressWarnings("unchecked")
	private List records;

	public PageDto() {
		this.dir = "asc";
	}

	public PageDto(int pageSize){
		this.pageSize = pageSize;
	}

	public PageDto(int pageSize, String sort, String dir){
		this.pageSize = pageSize;
		this.sort = sort;
		this.dir = dir;
	}

	/**
	 * @return the recordsReturned
	 */
	public Integer getRecordsReturned() {
		return recordsReturned;
	}

	/**
	 * @param recordsReturned the recordsReturned to set
	 */
	public void setRecordsReturned(Integer recordsReturned) {
		this.recordsReturned = recordsReturned;
	}

	/**
	 * @return the totalRecords
	 */
	public Integer getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	/**
	 * @return the startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * @return the dir
	 */
	public String getDir() {
		return dir;
	}

	/**
	 * @param dir the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the records
	 */
	public List getRecords() {
		return records;
	}

	/**
	 * @param records the records to set
	 */
	public void setRecords(List records) {
		this.records = records;
	}


	/**
	 * 通过计算获取总页数
	 * @return
	 */
	public Integer totalPages() {
		totalPages = totalRecords / pageSize + 1;
		if (totalRecords % pageSize == 0) {
			totalPages--;
		}
		return totalPages;
	}

}
