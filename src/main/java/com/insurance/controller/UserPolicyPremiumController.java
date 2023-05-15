package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyPremium;
import com.insurance.model.UserPremium;
import com.insurance.services.PolicyPremiumService;
import com.insurance.services.UserPremiumService;

/*Task 156 Design the API to store user with multiple premium details into database*/
@RestController
//@RequestMapping(value = "/user")
public class UserPolicyPremiumController {
	// inject the both services
	@Autowired
	private UserPremiumService userService;

	@Autowired
	private PolicyPremiumService policyService;

	@PostMapping("/userPolicy")
	public UserPremium saveUserPolicy(@RequestBody UserPremium user) {
		UserPremium user1 = userService.saveUser(user);
		List<PolicyPremium> policies = user.getPolicyList();
		for (PolicyPremium policy : policies) {
			policy.setUserId(user.getId());
			policyService.savePolicy(policy);
		}
		return user1;
	}

}