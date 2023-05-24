package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetails;

/*
 * Task 151 Build the Restful web service to get all the policy premium details for specific duration --------> Yash
 * Task 152 Design API to save all the premium details into database ------------> Abhijee
 * Task 153 Design API to get all the premium details from database----------> Rohini
 * Task 154 Design API to update premium details into database-----------> Vinayak
 * Task 155 Design API to delete premium details from database-----------> Yash
 */
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {

	@Query(value = "select * from premium_details p where policy_commencement_date=?/1", nativeQuery = true)
	List<PremiumDetails> findByDate(String policyCommencementDate);

	//
	public PremiumDetails findById(Integer Id);
}
