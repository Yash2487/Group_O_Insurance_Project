
package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.SettlementDeleteService;
/*Task 178 Design web service to delete the settlement details by Rohini*/

@RestController
public class SettlementDeleteController {
	// inject the service reference
	@Autowired
	private SettlementDeleteService settlementDeleteService;

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		settlementDeleteService.deleteById(id);
	}

}
