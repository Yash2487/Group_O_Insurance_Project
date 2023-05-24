package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails;
import com.insurance.service.PremiumDetailsService;

/*
 * Task 151 Build the Restful web service to get all the policy premium details for specific duration --------> Yash
 * Task 152 Design API to save all the premium details into database ------------> Abhijee
 * Task 153 Design API to get all the premium details from database----------> Rohini
 * Task 154 Design API to update premium details into database-----------> Vinayak
 * Task 155 Design API to delete premium details from database-----------> Yash
 */
@RestController
public class PremiumDetailsController {

	// inject service here
	@Autowired
	private PremiumDetailsService premiumDetailsService;

	/*
	 * Build the Restful web service to get all the policy premium details for
	 * specific duration
	 * 
	 * @author Yash
	 */
	@GetMapping("/getPolicyPremiumDetails/{policyCommencementDate}")
	public ResponseEntity<List<PremiumDetails>> getEmployeeData(
			@PathVariable("policyCommencementDate") String policyCommencementDate) {
		List<PremiumDetails> premiumDetails = premiumDetailsService.getEmployeeData(policyCommencementDate);
		return ResponseEntity.ok().body(premiumDetails);
	}

	/*
	 * Design API to save all the premium details into database
	 * 
	 * @author Abhijit
	 */
	@PostMapping("/savepremiPremiumDetails")
	public ResponseEntity<PremiumDetails> savepremiPremiumDetails(@RequestBody PremiumDetails premiumDetails) {
		PremiumDetails pd = premiumDetailsService.savePremiumDetails(premiumDetails);
		return ResponseEntity.ok().body(pd);
	}

	/*
	 * Design API to get all the premium details from database
	 * 
	 * @author Rohini
	 */
	@GetMapping("/getalldata")
	public List<PremiumDetails> getAllData() {
		List<PremiumDetails> userData = premiumDetailsService.getAllPremiumData();
		return (List<PremiumDetails>) userData;

	}

	/*
	 * Design API to update premium details into database
	 * 
	 * @author Vinayak
	 */
	@PutMapping("/updatePremiumDetails")
	public PremiumDetails updatePremiumDetails(@RequestBody PremiumDetails premiumDetails) {
		return premiumDetailsService.updatePremiumDetails(premiumDetails);

	}

	/*
	 * Design API to delete premium details from database
	 * 
	 * @author Yash
	 */
	@DeleteMapping("/deleteById/{id}")
	public String deletePremiumDetailsById(@PathVariable("id") int id) {

		return premiumDetailsService.deletePremiumDetailsById(id);
	}

}
