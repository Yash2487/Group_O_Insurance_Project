package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserInformation;

/*
 * Task- 138 Build the Restful API to delete the user details from database----------> Completed by Abhijeet
 */

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {

}
