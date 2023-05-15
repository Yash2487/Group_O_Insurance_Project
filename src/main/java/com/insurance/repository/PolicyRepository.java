package com.insurance.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Serializable> {

	/*
	 * Task 147 Build the Restful web service to get claim details Task completed by
	 * Abhijit Daware
	 */

	public Policy findById(Integer id);
}
