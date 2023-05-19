package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.NomineeDetailsRepository;
import com.insurance.service.NomineeDetailsService;

/*Task 170 Design Service to delete user with multiple nominee details into system ---
Task Completed By Abhijit Daware*/

@Service
public class NomineeDetailsServiceImpl implements NomineeDetailsService {

	@Autowired
	private NomineeDetailsRepository nomineeDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		nomineeDetailsRepository.deleteById(id);
	}

}
