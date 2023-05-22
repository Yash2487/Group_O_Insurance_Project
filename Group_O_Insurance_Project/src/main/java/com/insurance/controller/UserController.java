package com.insurance.controller;

//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.UserDetails;
import com.insurance.model.UserMultipleClaim;
import com.insurance.services.UserMultilpleClaimService;
import com.insurance.services.UserService;

@RestController
//@RequestMapping(value = "/userdetails")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserMultilpleClaimService userMultilpleClaimService;

	@PostMapping("/saveuserdetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {
		UserDetails user = userService.saveUserDetails(userDetails);
		List<UserMultipleClaim> userMultipleClaim = userDetails.getusermultipleclaimList();
		for (UserMultipleClaim userClaim : userMultipleClaim) {
			userClaim.setUserId(userDetails.getId());
			userMultilpleClaimService.saveUserMultipleClaim(userClaim);
		}
		return ResponseEntity.ok().body(user);

	}

}
