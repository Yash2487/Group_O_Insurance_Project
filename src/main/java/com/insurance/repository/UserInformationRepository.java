package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserInformation;

/*
 * Task 134- Build the Restful API to add user details into database ---------> Yash
 * Task 135- Build the Restful API to update user details into database-------- > Yash
 * Task 136- Build the Restful API to get user details from database --------> Vinayak
 * Task 137- Build the Restful API to fetch all user details from database --------> Rohini
 * Task 138- Build the Restful API to delete the user details from database----------> Abhijeet
 */
@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {
	// this will used to get user by id
	public UserInformation getUserById(int id);

	//
	public UserInformation findById(int id);

}
