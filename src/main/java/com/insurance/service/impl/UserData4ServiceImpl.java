package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserData4;
import com.insurance.repository.UserData4Repository;
import com.insurance.service.UserData4Service;
/* Task 137 Build the restful API to fetch all user details from the database Done By Rohini Shinde*/
@Service
public class UserData4ServiceImpl implements UserData4Service {
   //inject the repository reference
	@Autowired
	private UserData4Repository userData4Repository; 
	
	@Override
	public List<UserData4> getAllUserData() {
		List<UserData4> user= (List<UserData4>) userData4Repository.findAll();
		
		return user;
	}

}
