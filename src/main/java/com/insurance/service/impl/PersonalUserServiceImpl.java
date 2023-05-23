package com.insurance.service.impl;
////Task- 136 Build the Restful API to get user details from database --------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PersonalUser;
import com.insurance.repository.PersonalUserRepository;
import com.insurance.service.PersonalUserSerive;
@Service
public class PersonalUserServiceImpl implements PersonalUserSerive {

	@Autowired
	private PersonalUserRepository personalUserRepository;

	@Override
	public PersonalUser saveUserDeatils(PersonalUser personalUser) {
		PersonalUser user = personalUserRepository.save(personalUser);
		return user;
	}

	@Override
	public PersonalUser getUserDetails(Integer Id) {
		PersonalUser perUser = personalUserRepository.findById(Id);
		return perUser;
	}

}
