package com.insurance.service;
//Task- 136 Build the Restful API to get user details from database --------> Vinayak
import com.insurance.model.PersonalUser;

public interface PersonalUserSerive {

	//save user details
	public PersonalUser saveUserDeatils(PersonalUser personalUser);
	
	//get user details
	
	public PersonalUser getUserDetails(Integer Id);
	
	

}
