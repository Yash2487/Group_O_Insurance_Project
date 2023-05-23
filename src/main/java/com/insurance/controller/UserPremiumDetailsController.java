package com.insurance.controller;
//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.GetPremiumDetails;
import com.insurance.model.GetUser;
import com.insurance.service.GetPremiumDetailsService;
import com.insurance.service.GetUserService;

@RestController
@RequestMapping("/userPremium")
public class UserPremiumDetailsController {

	// Inject the GetPremiumDetailsServiceHere
	@Autowired
	private GetPremiumDetailsService getPremiumDetailsService;

	@Autowired
	private GetUserService getUserService;

	@PostMapping("/savePremiumDetails")
	public ResponseEntity<GetUser> saveUserPremiumDetails(@RequestBody GetUser getUser) {
		GetUser getUser1 = getUserService.saveGetUser(getUser);
		List<GetPremiumDetails> details = getUser.getGetPremiumDetailsList();
		for (GetPremiumDetails getPremiumDetails : details) {
			getPremiumDetails.setPremiumId(getUser.getId());
			getPremiumDetailsService.savePremiumDetails(getPremiumDetails);
		}
		return ResponseEntity.ok().body(getUser1);

	}

	@GetMapping("/getUserPremiumDetails/{Id}")
	public ResponseEntity<GetUser> getUserPremiumDetails(@RequestBody GetUser getUser) {
		GetUser getUser1 = getUserService.getUserAll(1);
		List<GetPremiumDetails> details = getUser.getGetPremiumDetailsList();
		for (GetPremiumDetails getPremiumDetails : details) {
			getPremiumDetails.setPremiumId(getUser.getId());
			getPremiumDetailsService.savePremiumDetails(getPremiumDetails);
		}
		return ResponseEntity.ok().body(getUser1);
	}
}
