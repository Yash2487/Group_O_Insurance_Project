package com.insurance.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.repository.SettlementDeleteRepository;
import com.insurance.service.SettlementDeleteService;

/*Task 178 Design web service to delete the settlement details by Rohini*/
@Service
public class SettlementDeleteServiceImpl implements SettlementDeleteService {
   //inject the repository reference
	@Autowired
	private SettlementDeleteRepository settlementDeleteRepository;
	
	
	@Override
	public void deleteById(Integer id) {
		settlementDeleteRepository.deleteById(id);
		
		
	}

}

