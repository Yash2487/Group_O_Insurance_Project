package com.insurance.services;

import com.insurance.model.GetPremiumDetails;

//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

public interface GetPremiumDetailsService {

	//save the premiumDetails
	public GetPremiumDetails savePremiumDetails(GetPremiumDetails getPremiumDetails);


	//Get the PremiumDetails
	public GetPremiumDetails getPremiumDetails(Integer Id);

}
