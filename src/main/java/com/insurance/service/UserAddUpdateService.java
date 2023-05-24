package com.insurance.service;

import com.insurance.model.UserAddUpdate;

public interface UserAddUpdateService {

	// this is used to add user details into DB
	public UserAddUpdate addUserDetails(UserAddUpdate user);

	// this is used to update user details by using id into DB
	public UserAddUpdate updateUserDeatils(UserAddUpdate user);

}
