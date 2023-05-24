package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDetails;

/*
 * Task 175- Design web service to add the settlement details once claim is done ------> Vinayak
 * Task 176- Design web service to update the settlement details from system -------> Vinayak
 * Task 177- Design web service to get the settlement details. -------> Abhijit
 * Task 178- Design web service to delete the settlement details. ---------> Rohini
 */

@Repository
public interface SettlementDetailsRepositoy extends CrudRepository<SettlementDetails, Serializable> {

	public SettlementDetails findById(Integer id);

}
