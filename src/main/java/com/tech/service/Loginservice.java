package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.Logindao;

@Service
public class Loginservice {

	public Loginservice() {
		System.out.println("inside Loginservice constructor ");
	}

	@Autowired
	Logindao logindao;
	
	public boolean LoginEmployee(String username, String password) {
		System.out.println("inside StudentService.updateStudent() ");
	boolean	 validate=logindao.LoginEmployee( username,password);
		return validate;
}
}
