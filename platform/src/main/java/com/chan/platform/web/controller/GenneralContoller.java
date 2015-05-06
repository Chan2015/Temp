package com.chan.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chan.platform.web.service.SysUserService;
import com.chan.platform.web.service.basic.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/basic")
public class GenneralContoller {
	
	@Autowired 
	private SysUserService sysUserService;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/index")
	public String modelView(Model model){
//		model.addAttribute("chan", userServiceImpl.findByUserName("chan").get(0).getId());
		return "redirect:/index.jsp";
	}
}
