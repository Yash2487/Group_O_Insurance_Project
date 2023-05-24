package com.insurance.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.GetPremiumDetails;
//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

@Repository
public interface GetPremiumDetailsRepository extends CrudRepository<GetPremiumDetails, Serializable> {

	public GetPremiumDetails findById(Integer Id);
}
