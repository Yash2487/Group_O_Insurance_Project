package com.insurance.controller;
//Task 154 Design API to update premium details into database-----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails;
import com.insurance.service.impl.PremiumDetailsServiceImpl;

@RestController
@CrossOrigin("*")
public class PremiumDetailsController {

	@Autowired
	private PremiumDetailsServiceImpl premiumDetailsServiceImpl;

	@PutMapping("/updatePremiumDetails")
	public PremiumDetails updatePremiumDetails(@RequestBody PremiumDetails premiumDetails) {
		return premiumDetailsServiceImpl.updatePremiumDetails(premiumDetails);

	}

}
