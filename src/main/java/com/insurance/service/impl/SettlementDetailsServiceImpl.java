package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.model.SettlementDetails;
import com.insurance.repository.SettlementDetailsRepositoy;
import com.insurance.service.SettlementDetailsService;

/*
 * Task 175- Design web service to add the settlement details once claim is done ------> Vinayak
 * Task 176- Design web service to update the settlement details from system -------> Vinayak
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

	@Override
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails) {
		SettlementDetails details = settlementDetailsRepositoy.save(settlementDetails);
		return details;
	}

	@Override
	public SettlementDetails updateSettlementDetails(Integer id, SettlementDetails settlementDetails) {
		SettlementDetails detail = settlementDetailsRepositoy.findById(id);
		SettlementDetails settle = null;
		if (detail == null) {
			throw new NullPointerException("The Given Id is Null");
		} else {
			detail.setSettlementId(settlementDetails.getSettlementId());
			detail.setClaimId(settlementDetails.getClaimId());
			detail.setAmount(settlementDetails.getAmount());
			detail.setDate(settlementDetails.getDate());
			detail.setStatus(settlementDetails.getStatus());
			settle = settlementDetailsRepositoy.save(detail);

		}
		return settle;

	}

}
