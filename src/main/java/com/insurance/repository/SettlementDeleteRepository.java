package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDelete;
/*Task 178 Design web service to delete the settlement details by Rohini*/

@Repository
public interface SettlementDeleteRepository extends CrudRepository<SettlementDelete, Integer> {

}
