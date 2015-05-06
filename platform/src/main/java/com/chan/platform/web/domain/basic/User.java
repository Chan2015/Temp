package com.chan.platform.web.domain.basic;

import javax.persistence.Entity;

import com.chan.platform.core.BaseAuditableEntity;
import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * 用户类
 * @author: Chan
 * @since : 2015-4-27
 */
@Entity
@JsonFilter(value = "documentViewInfoFilter")
public class User extends BaseAuditableEntity{

	private static final long serialVersionUID = 1L;
	
	/**
	 * @author: Chan
	 * @category 用户名
	 * @since: 2015-4-27
	 */
	private String userName;

	/**
	 * @author: Chan
	 * @category 当前记录是否有效
	 * @since: 2015-4-27
	 */
	private Boolean isValid;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
}
