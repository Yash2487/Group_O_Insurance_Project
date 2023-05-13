package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetails;
@Repository
public interface PremiumDetailsReposiitory extends JpaRepository<PremiumDetails, Integer>{
	
	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/
	
	

}
