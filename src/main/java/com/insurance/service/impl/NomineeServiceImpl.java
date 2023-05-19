package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.model.Nominee;
import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;


/*Task 167 Design Service to add user with multiple nominee details into system
 * completed By Abhijit Daware
 */

@Service
public class NomineeServiceImpl implements NomineeService {

	@Autowired
	private NomineeRepository nomineeRepository;

	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominees = nomineeRepository.save(nominee);
		return nominees;
	}
}
