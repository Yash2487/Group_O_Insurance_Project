package com.insurance.services;

/*Task 156 Design the API to store user with multiple premium details into database*/
import com.insurance.model.PolicyPremium;

public interface PolicyPremiumService {
	public PolicyPremium savePolicy(PolicyPremium policy);
}
