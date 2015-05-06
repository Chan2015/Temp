package com.chan.platform.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.chan.platform.web.domain.basic.User;
import com.chan.platform.web.service.basic.impl.UserServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class UserTest {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	//保存用户
    @Test
    public void testSaveUser() {
    	User user = new User();
    	user.setIsValid(true);
    	user.setUserName("花花公子");
    	userServiceImpl.saveUser(user);
    }
}
