package com.insurance.service;

import java.util.List;

import com.insurance.model.PremiumDetails;

/*
 * Task 151 Build the Restful web service to get all the policy premium details for specific duration --------> Yash
 * Task 152 Design API to save all the premium details into database ------------> Abhijee
 * Task 153 Design API to get all the premium details from database----------> Rohini
 * Task 154 Design API to update premium details into database-----------> Vinayak
 * Task 155 Design API to delete premium details from database-----------> Yash
 */
public interface PremiumDetailsService {

	// get all the policy premium details for specific duration
	public List<PremiumDetails> getEmployeeData(String policyCommencementDate);

	// to save all the premium details into database
	public PremiumDetails savePremiumDetails(PremiumDetails premiumDetails);

	// to get all the premium details from database
	public List<PremiumDetails> getAllPremiumData();

	// used to update premium details into database
	public PremiumDetails updatePremiumDetails(PremiumDetails premiumDetails);

	// to delete premium details from database
	public String deletePremiumDetailsById(int id);

}
