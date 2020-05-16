package org.jian.shadow.common;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
/**
 * 响应实体
 * @author jian
 *
 */
public class ResponseEntityInfo<T> {
	public ResponseEntityInfo() {}
	
	public ResponseEntityInfo(HttpStatus status, T entity, List<T> entities, PageInfo pageInfo, Map<String, Object> dataMap, String msg) {
		this.status = status;
		this.entity = entity;
		this.entities = entities;
		this.pageInfo = pageInfo;
		this.dataMap = dataMap;
		this.msg = msg;
	}
	
	private HttpStatus status;
	
	private T entity;
	
	private List<T> entities;
	
	private Map<String, Object> dataMap;
	
	private PageInfo pageInfo;
	
	private String msg;

	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public T getEntity() {
		return entity;
	}
	public void setEntity(T entity) {
		this.entity = entity;
	}
	public List<T> getEntities() {
		return entities;
	}
	public void setEntities(List<T> entities) {
		this.entities = entities;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
}
