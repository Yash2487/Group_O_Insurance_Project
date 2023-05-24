package com.insurance.service;

import java.util.List;

import com.insurance.model.UserInformation;

/*
 * Task 134- Build the Restful API to add user details into database ---------> Yash
 * Task 135- Build the Restful API to update user details into database-------- > Yash
 * Task 136- Build the Restful API to get user details from database --------> Vinayak
 * Task 137- Build the Restful API to fetch all user details from database --------> Rohini
 * Task 138- Build the Restful API to delete the user details from database----------> Abhijeet
 */
public interface UserInformationService {
	// this is used to delete user details by id
	public void DeletedById(Integer id);

	// this is used to add user details into DB
	public UserInformation addUserDetails(UserInformation user);

	// this is used to update user details by using id into DB
	public UserInformation updateUserDeatils(UserInformation user);

	// get user details
	public List<UserInformation> getAllUserData();

	// get user details by id
	UserInformation getUserDetails(int id);
}
