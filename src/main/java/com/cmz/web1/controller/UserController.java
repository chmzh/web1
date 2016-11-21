package com.cmz.web1.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmz.web1.service.UserService;

@Controller
@RequestMapping("user/")
public class UserController {
	
	@PostConstruct
	public void init(){
		System.out.println(UserController.class.getName()+"init");
	}
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	@ResponseBody
	public String show(){
		userService.update();
		return "hello";
	}
}
