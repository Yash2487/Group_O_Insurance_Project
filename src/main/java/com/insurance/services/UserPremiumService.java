package com.insurance.services;

/*Task 156 Design the API to store user with multiple premium details into database*/
import com.insurance.model.UserPremium;

public interface UserPremiumService {
	public UserPremium saveUser(UserPremium user);

}
