package com.insurance.repository;

/*
 * Task 166-> Design API to download all the matured policies details into excel file
 * matured policy means who crosses the expire date 
 * @author Yash Mate
 */
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyExcel;

@Repository
public interface PolicyExcelRepository extends CrudRepository<PolicyExcel, Serializable> {

	@Query(value = "select * from policy p where policy_expiry_date=?/1", nativeQuery = true)
	List<PolicyExcel> findByExpiryDate(String policyExpiryDate);

}
