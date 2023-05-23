package com.insurance.service;

import com.insurance.model.SettlementDetails;

/*
 * Task 175- Design web service to add the settlement details once claim is done ------> Vinayak
 * Task 176- Design web service to update the settlement details from system -------> Vinayak
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 */

public interface SettlementDetailsService {

	// this will used to get the settlement details
	public SettlementDetails getSettlementDetailsById(Integer id);

	// this will used to add the settlement details once claim is done
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails);

	// this will used to update the settlement details from system
	public SettlementDetails updateSettlementDetails(Integer id, SettlementDetails settlementDetails);
}
