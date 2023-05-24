package com.insurance.controller;

/*
 * Task 166-> Design API to download all the matured policies details into excel file
 * matured policy means who crosses the expire date 
 * @author Yash Mate
 */
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.PolicyExcelService;

@RestController
public class PolicyExcelController {
	// inject service here
	@Autowired
	private PolicyExcelService policyService;

	// Design API to download all the matured policies details into excel file
	@GetMapping("/excel/{policyExpiryDate}")
	public void generateExcel(HttpServletResponse httpServletResponse,
			@PathVariable("policyExpiryDate") String policyExpiryDate) throws Exception {

		httpServletResponse.setContentType("application/octet-stream");

		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=matured_policy.xls";

		httpServletResponse.setHeader(headerKey, headerValue);

		policyService.generateExcel(httpServletResponse, policyExpiryDate);
	}

}
