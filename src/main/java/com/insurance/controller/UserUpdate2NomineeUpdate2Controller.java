package com.insurance.controller;
/*Task 168 Design service to update user with multiple nominee details into system*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.NomineeUpdate2;
import com.insurance.model.UserUpdate2;
import com.insurance.services.NomineeUpdate2Service;
import com.insurance.services.UserUpdate2Service;
@RestController
public class UserUpdate2NomineeUpdate2Controller {

	// inject the both service reference
	@Autowired
	private UserUpdate2Service userUpdate2Service;

	@Autowired
	private NomineeUpdate2Service nomineeUpdate2Service;
    
	@PutMapping("/updateUserData/{id}")
	public ResponseEntity<UserUpdate2> saveUserUpdate2(@RequestBody UserUpdate2 userUpdate2,@PathVariable("id")Integer id) {
		UserUpdate2 userUpdate = userUpdate2Service.updateUserUpdate2(userUpdate2);
		List<NomineeUpdate2> nomines = userUpdate2.getNomineeUpdate2List();
		for (NomineeUpdate2 userData : nomines) {
			userData.setId(userUpdate2.getId());
			nomineeUpdate2Service.updateNomineeUpdate(userData);

		}
		return ResponseEntity.ok().body(userUpdate);

	}

}
