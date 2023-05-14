package com.insurance.services;

import java.util.List;

import com.insurance.model.PremiumGet;
/*Task  153 Design the API to get all the premium details from the database*/
public interface PremiumGetService {
	public List<PremiumGet> getAllPremiumData();

}
