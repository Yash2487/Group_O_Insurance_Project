package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.UserData4;
import com.insurance.service.UserData4Service;
/* Task 137 Build the restful API to fetch all user details from the database Done By Rohini Shinde*/

@RestController
public class UserData4Controller {
	//inject the service reference
	@Autowired
	private UserData4Service userData4Service;
	
	@GetMapping("/getAllUserData")
	public List<UserData4> getAllUserData(){
		List<UserData4> userData = userData4Service.getAllUserData();
		return (List<UserData4>) userData;
	}

}
