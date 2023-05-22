package com.insurance.service;

/*
 * Task 166-> Design API to download all the matured policies details into excel file
 * matured policy means who crosses the expire date 
 * @author Yash Mate
 */
import javax.servlet.http.HttpServletResponse;

public interface PolicyExcelService {

	public void generateExcel(HttpServletResponse httpServletResponse, String policyExpiryDate) throws Exception;
	/*
	 * to get data of our DB into excel file we use this HttpServletResponse
	 */
}
