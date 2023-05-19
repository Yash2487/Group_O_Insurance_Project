package com.insurance.controller;

/*
 * Task 155 Design API to delete premium details from database
 * by Yash
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.PremiumDetailsDeleteService;

@RestController
public class PremiumDetailsDeleteController {

	// inject service here
	@Autowired
	private PremiumDetailsDeleteService premiumDetailsDeleteService;

	// Design API to delete premium details from database
	@DeleteMapping("/deleteById/{id}")
	public String deletePremiumDetailsById(@PathVariable("id") int id) {

		return premiumDetailsDeleteService.deletePremiumDetailsById(id);
	}

}
