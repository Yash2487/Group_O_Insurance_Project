package com.insurance.service.impl;
//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.GetUser;
import com.insurance.repository.GetUserRepository;
import com.insurance.service.GetUserService;

@Service
public class GetUserServiceImpl implements GetUserService {

	// Inject the GetUserRepository here
	@Autowired
	private GetUserRepository getUserRepository;

	@Override
	public GetUser saveGetUser(GetUser getUser) {
		return getUserRepository.save(getUser);

	}

	// If we Don't want return type as a <optional> we must check in service there
	// argument
	// should be in This format(Integer Id) and check in Repository also
	@Override
	public GetUser getUserAll(Integer Id) {
		System.out.println("hello");
		GetUser get = getUserRepository.findById(Id);
		System.out.println(get + "This is Vinayak");
		return get;

	}

}
