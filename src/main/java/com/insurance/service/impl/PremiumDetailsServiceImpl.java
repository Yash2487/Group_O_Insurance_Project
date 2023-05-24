package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails;
import com.insurance.repository.PremiumDetailsRepository;
import com.insurance.service.PremiumDetailsService;

/*
 * Task 151 Build the Restful web service to get all the policy premium details for specific duration --------> Yash
 * Task 152 Design API to save all the premium details into database ------------> Abhijee
 * Task 153 Design API to get all the premium details from database----------> Rohini
 * Task 154 Design API to update premium details into database-----------> Vinayak
 * Task 155 Design API to delete premium details from database-----------> Yash
 */
@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	// inject repository here
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	// to get all the policy premium details for specific duration
	@Override
	public List<PremiumDetails> getEmployeeData(String policyCommencementDate) {
		return premiumDetailsRepository.findByDate(policyCommencementDate);
	}

	// to save all the premium details into database
	@Override
	public PremiumDetails savePremiumDetails(PremiumDetails premiumDetails) {
		PremiumDetails pd = premiumDetailsRepository.save(premiumDetails);
		return pd;
	}

	// get all the premium details from the database
	@Override
	public List<PremiumDetails> getAllPremiumData() {
		return (List<PremiumDetails>) premiumDetailsRepository.findAll();
	}

	// to update premium details into database
	@Override
	public PremiumDetails updatePremiumDetails(PremiumDetails premiumDetails) {
		return premiumDetailsRepository.save(premiumDetails);
	}

	// to delete premium details from database
	@Override
	public String deletePremiumDetailsById(int id) {
		premiumDetailsRepository.deleteById(id);
		return "Record Is Deleted For Id>> " + id;
	}

}
