package com.bjsxt.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.service.UsersService;


@Controller
@RequestMapping("/user")
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("/show")
	public String show(Model model){
		System.out.println("user.show.. yanglei");
		model.addAttribute("list", usersServiceImpl.show());
		System.out.println(123);
		return "list";
	}
}
