package com.chan.platform.web.service.basic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chan.platform.web.domain.basic.User;
import com.chan.platform.web.repository.basic.UserRepository;
import com.chan.platform.web.service.basic.IUserService;

/**
 * 用户操作实现类
 * @author: Chan
 * @since : 2015-4-27
 */
@Service("IUserService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

	public List<User> findByUserName(String userName) {
		return userRepository.findUserByUserName(userName);
	}
}
