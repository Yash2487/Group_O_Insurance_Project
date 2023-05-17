package com.insurance.service;
//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import com.insurance.model.UserDetails;

public interface UserService {

	public UserDetails saveUserDetails(UserDetails userDetails);
}
