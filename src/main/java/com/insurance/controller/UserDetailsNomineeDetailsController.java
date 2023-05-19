package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.NomineeDetailsService;
import com.insurance.service.UserDetailsService;


/*Task 170 Design Service to delete user with multiple nominee details into system ---
Task Completed By Abhijit Daware*/


@RestController
@RequestMapping("/delete")
public class UserDetailsNomineeDetailsController {
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private NomineeDetailsService nomineeDetailsService;

	@DeleteMapping("/deleteData/{id}")
	public void deleteUserDetailsNomineeDetailsId(@PathVariable("id") Integer id) {
		nomineeDetailsService.deleteById(id);
		userDetailsService.deleteById(id);
	}
}
