package com.shsxt.service;

import com.shsxt.dao.UserDao;
//構造器注入
public class UserService2 {

	private UserDao userDao;

	public UserService2(UserDao userDao) {
		this.userDao = userDao;
	}

	public void print() {
		System.out.println(userDao);
	}
}
