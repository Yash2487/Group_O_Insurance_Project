package com.insurance.service;

import java.util.List;

import com.insurance.model.PremiumDetails;

/*
 * Task 151 Build the Restful web service to
 * get all the policy premium details for specific duration
 * by-> Yash
 */
public interface PremiumDetailsService {

	public List<PremiumDetails> getEmployeeData(String policyCommencementDate);

}
