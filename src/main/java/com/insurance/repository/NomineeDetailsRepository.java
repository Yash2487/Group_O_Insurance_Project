package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.NomineeDetails;

/*Task 170 Design Service to delete user with multiple nominee details into system ---
Task Completed By Abhijit Daware*/


@Repository
public interface NomineeDetailsRepository extends JpaRepository<NomineeDetails, Serializable>{

	
}
