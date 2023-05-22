package com.insurance.services;

//Task 154 Design API to update premium details into database-----------> Vinayak
import com.insurance.model.PremiumDetailsUpdate;

public interface PremiumDetailsUpdateService {

	public PremiumDetailsUpdate updatePremiumDetails(PremiumDetailsUpdate premiumDetails);

}
