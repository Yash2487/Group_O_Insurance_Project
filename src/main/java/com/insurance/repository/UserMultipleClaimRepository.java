package com.insurance.repository;
//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserMultipleClaim;

@Repository
public interface UserMultipleClaimRepository extends JpaRepository<UserMultipleClaim, Integer> {

}
