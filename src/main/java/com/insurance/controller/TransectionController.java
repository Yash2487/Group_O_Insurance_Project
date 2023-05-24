package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Transection;
import com.insurance.service.TransectionService;

@RestController
public class TransectionController {

	@Autowired
	private TransectionService transectionService;

	@PutMapping("/updateData/{id}")
	public Transection updateTransectionDetails(@RequestBody Transection transection,@PathVariable ("id") int id) {
		Transection transection2 = transectionService.updateTransectionDetails(transection);
		return transection2;
	}
}
