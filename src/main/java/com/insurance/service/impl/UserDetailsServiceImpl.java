package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.UserDetailsRepository;
import com.insurance.service.UserDetailsService;

/*Task 170 Design Service to delete user with multiple nominee details into system ---
Task Completed By Abhijit Daware*/

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		userDetailsRepository.deleteById(id);

	}

}
