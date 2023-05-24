package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.ClaimDetails;

/*
 * Task 145--Build the Restful web service to add claim details------> Vinayak
 * Task 146--Build the Restful web service to update claim details--------> Rohini
 * Task 147--Build the Restful web service to get claim details-------> Abhijit
 * Task 148--Build the Restful web service to delete claim details ----------> Rohini
 */
@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Integer> {

	// This is used to delete claim details
	public ClaimDetails findById(int id);

}
