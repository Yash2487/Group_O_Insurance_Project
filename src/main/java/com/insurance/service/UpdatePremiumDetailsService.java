package com.insurance.service;
//Task 154 Design API to update premium details into database-----------> Vinayak
import com.insurance.model.PremiumDetails;

public interface UpdatePremiumDetailsService {

	// To update Premium details

	public PremiumDetails updatePremiumDetails(PremiumDetails premiumDetails);

}
