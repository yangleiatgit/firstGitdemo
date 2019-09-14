package com.bjsxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Resource
	private UsersMapper usersMapper;
	public List<Users> show() {
		System.out.println("usersMapper = "+usersMapper );
		return usersMapper.selAll();
	}

}
