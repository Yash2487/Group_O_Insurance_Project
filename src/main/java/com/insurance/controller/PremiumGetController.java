package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumGet;
import com.insurance.services.PremiumGetService;
/*Task  153 Design the API to get all the premium details from the database*/
@RestController
public class PremiumGetController {
	//inject the Service reference
	@Autowired
	private PremiumGetService premiumGetService;
	// Design the Restful Web Service to get all the Premium Data from the database
	@GetMapping("/getalldata")
	public List<PremiumGet> getAllData(){
		List<PremiumGet> userData = premiumGetService.getAllPremiumData();
		return (List<PremiumGet>) userData;
		
	}

}
