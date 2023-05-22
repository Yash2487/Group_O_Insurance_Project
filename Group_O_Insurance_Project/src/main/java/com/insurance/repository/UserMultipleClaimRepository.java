package com.insurance.repository;

//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.model.UserMultipleClaim;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMultipleClaimRepository extends JpaRepository<UserMultipleClaim, Integer> {

}
