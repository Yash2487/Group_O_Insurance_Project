package com.insurance.service;
//Task 154 Design API to update premium details into database-----------> Vinayak
import com.insurance.model.PremiumDetailsUpdate;

public interface PremiumDetailsUpdateService {

	// To update Premium details

	public PremiumDetailsUpdate updatePremiumDetails(PremiumDetailsUpdate premiumDetails);

}
