package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.model.User;
import com.insurance.services.PolicyService;
import com.insurance.services.UserService;

/*Task 156 Design the API to store user with multiple premium details into database*/
@RestController
//@RequestMapping(value = "/user")
public class UserPolicyController {
	// inject the both services
	@Autowired
	private UserService userService;

	@Autowired
	private PolicyService policyService;

	@PostMapping("/userPolicy")
	public User saveUserPolicy(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Policy> policies = user.getPolicyList();
		for (Policy policy : policies) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return user1;
	}

}