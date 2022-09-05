package com.banking.service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.banking.dao.UserDaoImpl;
import com.banking.entity.User;

public class UserServiceImpl {
	
	@Autowired
	public UserDaoImpl daoObj;

	public UserDaoImpl getDaoObj() {
		return daoObj;
	}

	public void setDaoObj(UserDaoImpl daoObj) {
		this.daoObj = daoObj;
	}

	public int createUser(User user) {
		
		int userid=daoObj.insertrcr(user);
		
		return userid;
	}

	public boolean searchUser(User user) {
		boolean flag = false;
		
		flag = daoObj.rcrsearch(user);
		
		return flag;
	}
}
