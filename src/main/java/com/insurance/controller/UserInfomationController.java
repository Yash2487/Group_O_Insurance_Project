package com.insurance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.UserInformation;
import com.insurance.service.UserInformationService;
/*
 * Task 134- Build the Restful API to add user details into database ---------> Yash
 * Task 135- Build the Restful API to update user details into database-------- > Yash
 * Task 136- Build the Restful API to get user details from database --------> Vinayak
 * Task 137- Build the Restful API to fetch all user details from database --------> Rohini
 * Task 138- Build the Restful API to delete the user details from database----------> Abhijeet
 */

@RestController
public class UserInfomationController {
	// create object of logger
	private static final Logger log = LoggerFactory.getLogger(UserInfomationController.class);

	@Autowired
	private UserInformationService userInformationService;

	/*
	 * Task 134- Build the Restful API to add user details into database
	 * 
	 * @author Yash Mate
	 */
	@PostMapping("/addUserDetails")
	public UserInformation addUserDetails(@RequestBody UserInformation user) {
		log.info("In RestController->addUserDetails(), adding user Data");
		return userInformationService.addUserDetails(user);
	}

	/*
	 * Task 135- Build the Restful API to update user details into database
	 * 
	 * @author Yash Mate
	 */
	@PutMapping("/updateUserDetail/{id}")
	public UserInformation updateUserDeatils(@RequestBody UserInformation user, @PathVariable("id") int id) {
		log.info("In RestController->updateUserDeatils(), updating user Data");
		return userInformationService.updateUserDeatils(user);
	}

	/*
	 * Task 136- Build the Restful API to get user details from database
	 * 
	 * @author Vinayak
	 */
	@GetMapping("/getPersonalDetails/{id}")
	public ResponseEntity<UserInformation> getUserDetailsbById(@PathVariable("id") Integer id) {
		log.info("In RestController->getUserDetailsbById, geting user Data by using id");
		UserInformation user1 = userInformationService.getUserDetails(id);
		return ResponseEntity.ok().body(user1);

	}

	/*
	 * Task 137- Build the Restful API to fetch all user details from database
	 * 
	 * @author Rohini
	 */
	@GetMapping("/getAllUserData")
	public List<UserInformation> getAllUserData() {
		log.info("In RestController->getAllUserData, geting all user Data");
		List<UserInformation> userData = userInformationService.getAllUserData();
		return (List<UserInformation>) userData;
	}

	/*
	 * Task 138- Build the Restful API to delete the user details from database
	 * 
	 * @author Abhijeet
	 */
	@DeleteMapping("/deletedata/{id}")
	public void DeleteUserInfomationDetailsId(@PathVariable("id") Integer id) {
		log.info("In RestController->DeleteUserInfomationDetailsId(), deleting user Data by id");
		userInformationService.DeletedById(id);
	}
}
