package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.SettlementDetails;
import com.insurance.repository.SettlementDetailsRepository;
import com.insurance.services.SettlementDetailsService;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService {

	@Autowired
	private SettlementDetailsRepository settlementDetailsRepository;

	@Override
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails) {
		SettlementDetails details = settlementDetailsRepository.save(settlementDetails);
		return details;
	}

}
