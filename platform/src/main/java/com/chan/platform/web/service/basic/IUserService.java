package com.chan.platform.web.service.basic;

import java.util.List;

import com.chan.platform.web.domain.basic.User;

/**
 * 用户操作service接口
 * @author: Chan
 * @since : 2015-4-27
 */
public interface IUserService {
	
	/**
	 * 保存用户
	 * @category
	 * @author: Chan
	 * @since: 2015-4-27
	 * @param user
	 */
	public void saveUser(User user);
	
	/**
	 * 通过用户名进行查询
	 * @category
	 * @author: Chan
	 * @since: 2015-4-27
	 * @param userName
	 * @return
	 */
	public List<User> findByUserName(String userName);
}
