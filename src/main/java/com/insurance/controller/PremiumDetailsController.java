package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails;
import com.insurance.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {
	
	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/
	
	@Autowired
	private PremiumDetailsService premiumDetailsService;

	@PostMapping("/savepremiPremiumDetails")
	public ResponseEntity<PremiumDetails> savepremiPremiumDetails(@RequestBody PremiumDetails premiumDetails) {
		PremiumDetails pd = premiumDetailsService.savePremiumDetails(premiumDetails);
		return ResponseEntity.ok().body(pd);
	}
}
