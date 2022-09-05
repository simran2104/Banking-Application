package com.banking.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.banking.entity.User;

public class UserDaoImpl {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insertrcr(User user) {

		int i = (Integer) this.hibernateTemplate.save(user); 
		return i;
	}

	public boolean rcrsearch(User user) {
		// TODO Auto-generated method stub
		
		String fname = user.getFname();
		String lname = user.getLname();
		
		boolean status = hibernateTemplate.contains(user);
		
		return status;
	}
	
	

}
