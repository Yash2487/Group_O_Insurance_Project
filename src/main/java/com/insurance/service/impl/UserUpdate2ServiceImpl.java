package com.insurance.service.impl;
/*Task 168 Design service to update user with multiple nominee details into system*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserUpdate2;
import com.insurance.repository.UserUpdate2Repository;
import com.insurance.services.UserUpdate2Service;
@Service
public class UserUpdate2ServiceImpl implements UserUpdate2Service {
	// inject the repository reference
	@Autowired
	private UserUpdate2Repository userUpdate2Repository;

	@Override
	public UserUpdate2 updateUserUpdate2(UserUpdate2 userUpdate2) {
		UserUpdate2 userUpdate3 = userUpdate2Repository.findById(userUpdate2.getId()).orElse(null);
		if (userUpdate2 != null) {
			userUpdate2.setName(userUpdate2.getName());
			userUpdate2Repository.save(userUpdate2);
			return userUpdate2;

		}

		return null;
	}

}
