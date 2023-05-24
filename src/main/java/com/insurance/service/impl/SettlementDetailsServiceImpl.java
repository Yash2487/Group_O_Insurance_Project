package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.model.SettlementDetails;
import com.insurance.repository.SettlementDetailsRepositoy;
import com.insurance.service.SettlementDetailsService;

/*
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 */

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService {

	@Autowired
	private SettlementDetailsRepositoy settlementDetailsRepositoy;

	@Override
	public SettlementDetails getSettlementDetailsById(Integer id) {
		SettlementDetails std = settlementDetailsRepositoy.findById(id);
		return std;
	}

}
