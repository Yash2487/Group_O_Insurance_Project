package com.insurance.repository;

//Task 160: Design API to fetch policy schedule details from system -----> Vinayak.
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.IndianPolicyShedule;

@Repository
public interface IndianPolicySheduleRepository extends CrudRepository<IndianPolicyShedule, Serializable> {

	public IndianPolicyShedule findById(Integer Id);

}
