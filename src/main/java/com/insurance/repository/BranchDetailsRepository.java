package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchDetails;

/*
 * Task 161: Design API to add branch details into system--------> Abhijit
 * Task 162: Design API to update branch details into system.-------> Rohini
 * Task 163: Design API to fetch branch details from system.----------> Yash
 */
@Repository
public interface BranchDetailsRepository extends CrudRepository<BranchDetails, Serializable> {
	
	// this is used to fetch details by using id
	public BranchDetails findDetailsById(int id);
}
