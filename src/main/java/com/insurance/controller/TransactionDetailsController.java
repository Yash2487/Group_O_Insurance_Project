package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/*Task 174 Design API to get the transaction details for each user after paying the premium*/
import com.insurance.model.TransactionDetails;
import com.insurance.services.TransactionDetailsService;

@RestController
public class TransactionDetailsController {
	//inject the service interface
	@Autowired
	private TransactionDetailsService transactionDetailsService;
	
	//Design the API 
	@GetMapping("/get/{id}")
	public ResponseEntity<TransactionDetails> saveTransactionDetails(@PathVariable("id") TransactionDetails transactionDetails) {
		//call the service method
		TransactionDetails transaction = transactionDetailsService.saveTransactionDetails(transactionDetails);
		return ResponseEntity.ok().body(transaction);
	}
	

}
