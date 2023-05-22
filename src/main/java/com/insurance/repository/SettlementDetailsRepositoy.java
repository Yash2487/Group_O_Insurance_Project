package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDetails;

/*
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 */

@Repository
public interface SettlementDetailsRepositoy extends CrudRepository<SettlementDetails, Serializable> {

	public SettlementDetails findById(Integer id);

}