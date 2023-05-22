package com.insurance.controller;

//Task 154 Design API to update premium details into database-----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetailsUpdate;
import com.insurance.service.impl.PremiumDetailsUpdateServiceImpl;

@RestController
@CrossOrigin("*")
public class UpdatePremiumDetailsController {

	@Autowired
	private PremiumDetailsUpdateServiceImpl premiumDetailsServiceImpl;

	@PutMapping("/updatePremiumDetails")
	public PremiumDetailsUpdate updatePremiumDetails(@RequestBody PremiumDetailsUpdate premiumDetails) {
		return premiumDetailsServiceImpl.updatePremiumDetails(premiumDetails);

	}

}
