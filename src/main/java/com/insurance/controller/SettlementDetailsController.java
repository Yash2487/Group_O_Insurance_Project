package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.SettlementDetails;
import com.insurance.service.SettlementDetailsService;

/*
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 */

@RestController
public class SettlementDetailsController {
	@Autowired
	private SettlementDetailsService settlementDetailsService;

	@GetMapping("/getdata/{id}")
	public ResponseEntity<SettlementDetails> getSettlementDetailsById(@PathVariable("id") Integer id) {
		SettlementDetails std = settlementDetailsService.getSettlementDetailsById(id);
		return ResponseEntity.ok().body(std);
	}
}
