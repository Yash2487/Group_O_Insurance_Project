package com.insurance.controller;
//Task- 136 Build the Restful API to get user details from database --------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PersonalUser;
import com.insurance.service.PersonalUserSerive;

@RestController
public class PersonalUserController {

	@Autowired
	private PersonalUserSerive personalUserSerive;

	@PostMapping("/savePersonalDetails")
	public PersonalUser saveAllDetails(@RequestBody PersonalUser personalUser) {
		PersonalUser user = personalUserSerive.saveUserDeatils(personalUser);
		return user;
	}

	@GetMapping("/getPersonalDetails/{id}")
	public ResponseEntity<PersonalUser> getUserDetailsbById(@PathVariable("id") Integer id) {
		PersonalUser user1 = personalUserSerive.getUserDetails(id);
		return ResponseEntity.ok().body(user1);

	}

}
