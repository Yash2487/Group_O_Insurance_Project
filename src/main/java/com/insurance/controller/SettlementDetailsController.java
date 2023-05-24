package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.SettlementDetails;
import com.insurance.service.SettlementDetailsService;

/*
 * Task 175- Design web service to add the settlement details once claim is done ------> Vinayak
 * Task 176- Design web service to update the settlement details from system -------> Vinayak
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 * Task 178- Design web service to delete the settlement details. ---------> Rohini
 */

@RestController
public class SettlementDetailsController {
	@Autowired
	private SettlementDetailsService settlementDetailsService;

	/*
	 * Design web service to get the settlement details
	 * 
	 * @author Abhijit
	 */
	@GetMapping("/getdata/{id}")
	public ResponseEntity<SettlementDetails> getSettlementDetailsById(@PathVariable("id") Integer id) {
		SettlementDetails std = settlementDetailsService.getSettlementDetailsById(id);
		return ResponseEntity.ok().body(std);
	}

	/*
	 * Design web service to add the settlement details once claim is done
	 * 
	 * @author Vinayak
	 */
	@PostMapping("/SettlementDetails")
	public SettlementDetails saveAllsettlementDetails(@RequestBody SettlementDetails settlementDetails) {

		SettlementDetails save = settlementDetailsService.saveSettlementDetails(settlementDetails);
		return save;

	}

	/*
	 * Design web service to update the settlement details from system
	 * 
	 * @author Vinayak
	 */
	@PutMapping("/settlementDetails/{id}")
	public SettlementDetails updateSettlementDetails(@PathVariable("id") Integer id,
			@RequestBody SettlementDetails settlementDetails) {
		SettlementDetails det = settlementDetailsService.updateSettlementDetails(id, settlementDetails);
		return det;

	}

	/*
	 * Design web service to delete the settlement details
	 * 
	 * @author Rohini
	 */
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		settlementDetailsService.deleteById(id);
	}
}
