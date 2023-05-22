package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.UserInformationRepository;
import com.insurance.service.UserInformationService;

/*
 * Task- 138 Build the Restful API to delete the user details from database----------> Completed by Abhijeet
 */

@Service
public class UserInformationServiceImpl implements UserInformationService {
	@Autowired
	private UserInformationRepository userInformationRepository;

	@Override
	public void DeletedById(Integer id) {
		userInformationRepository.deleteById(id);
	}

}
