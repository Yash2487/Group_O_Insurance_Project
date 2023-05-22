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
 * Task 151 Build the Restful web service to
 * get all the policy premium details for specific duration
 * by-> Yash
 */

public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {

	@Query(value = "select * from premium_details p where policy_commencement_date=?/1", nativeQuery = true)
	List<PremiumDetails> findByDate(String policyCommencementDate);
}
