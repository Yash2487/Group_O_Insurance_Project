package com.insurance.service;

import com.insurance.model.GetUser;

//Task 157 Design API to get user with multiple premium details from database--------> Vinayak
public interface GetUserService {
	
	//save the User Details
	public GetUser saveGetUser(GetUser getUser);
	
	//Get the user details
	public GetUser getUserAll(Integer Id);
	
	

}
