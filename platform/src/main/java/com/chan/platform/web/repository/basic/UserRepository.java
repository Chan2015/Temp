package com.chan.platform.web.repository.basic;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.chan.platform.web.domain.basic.User;

/**
 * 用户操作repository
 * @author: Chan
 * @since : 2015-4-27
 */
public interface UserRepository extends Repository<User, String>{
	
	/**
	 * 保存操作
	 * @category
	 * @author: Chan
	 * @since: 2015-4-27
	 * @param user
	 */
	void save(User user);
	
	/**
	 * 按用户名进行查询，返回一个list
	 * @category
	 * @author: Chan
	 * @since: 2015-4-27
	 * @param name
	 * @return
	 */
	List<User> findUserByUserName(String userName);
}
