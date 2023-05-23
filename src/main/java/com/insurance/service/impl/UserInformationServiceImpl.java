package com.insurance.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserInformation;
import com.insurance.repository.UserInformationRepository;
import com.insurance.service.UserInformationService;

/*
 * Task 134- Build the Restful API to add user details into database ---------> Yash
 * Task 135- Build the Restful API to update user details into database-------- > Yash
 * Task 136- Build the Restful API to get user details from database --------> Vinayak
 * Task 137- Build the Restful API to fetch all user details from database --------> Rohini
 * Task 138- Build the Restful API to delete the user details from database----------> Abhijeet
 */
@Service
public class UserInformationServiceImpl implements UserInformationService {

	// create object of logger
	private static final Logger log = LoggerFactory.getLogger(UserInformationService.class);

	@Autowired
	private UserInformationRepository userInfoRepo;

	// this is used to add user details into database
	@Override
	public UserInformation addUserDetails(UserInformation user) {
		log.info("In UserServiceImpl->addUserDetails(), add user method");
		return userInfoRepo.save(user);
	}

	// this is used to update user details into database
	@Override
	public UserInformation updateUserDeatils(UserInformation user) {
		log.info("In UserServiceImpl->updateUserDeatils(), update user method");
		UserInformation user2 = userInfoRepo.findById(user.getId());
		if (user2 != null) {
			user2.setName(user.getName());
			user2.setCity(user.getCity());
			user2.setEmail(user.getEmail());
			userInfoRepo.save(user2);
			return user2;
		}
		return null;
	}

	// this is used to get user details from database
	@Override
	public UserInformation getUserDetails(int id) {
		log.info("In UserServiceImpl->getUserDetails(), get user details method");
		UserInformation perUser = userInfoRepo.findById(id);
		return perUser;
	}

	// this is used to fetch all user details from database
	@Override
	public List<UserInformation> getAllUserData() {
		log.info("In UserServiceImpl->getAllUserData(), get all user details method");
		List<UserInformation> user = (List<UserInformation>) userInfoRepo.findAll();
		return user;
	}

	// this is used to delete the user details from database
	@Override
	public void DeletedById(Integer id) {
		log.info("In UserServiceImpl->DeletedById(), delete user details method");
		userInfoRepo.deleteById(id);
	}

}
