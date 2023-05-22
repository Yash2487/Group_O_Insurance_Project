package com.insurance.service.impl;

/*
 * Task 155 Design API to delete premium details from database
 * by Yash
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.PremiumDetailsDeleteRepository;
import com.insurance.service.PremiumDetailsDeleteService;

@Service
public class PremiumDetailsDeleteServiceImpl implements PremiumDetailsDeleteService {

	// inject repository here
	@Autowired
	private PremiumDetailsDeleteRepository premiumDetailsDeleteRepository;

	@Override
	public String deletePremiumDetailsById(int id) {
		premiumDetailsDeleteRepository.deleteById(id);
		return "Record Is Deleted For Id>> " + id;
	}

}
