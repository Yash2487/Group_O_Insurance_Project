package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetailsInfo;
import com.insurance.service.PremiumDetailsInfoService;

@RestController
public class PremiumDetailsInfoController {
	
	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/
	
	@Autowired
	private PremiumDetailsInfoService premiumDetailsService;

	@PostMapping("/savepremiPremiumDetails")
	public ResponseEntity<PremiumDetailsInfo> savepremiPremiumDetails(@RequestBody PremiumDetailsInfo premiumDetails) {
		PremiumDetailsInfo pd = premiumDetailsService.savePremiumDetails(premiumDetails);
		return ResponseEntity.ok().body(pd);
	}
}
