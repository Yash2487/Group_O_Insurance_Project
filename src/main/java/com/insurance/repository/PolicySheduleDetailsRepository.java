package com.insurance.repository;

/*
 * Task 158 Design API to add policy schedule details into database
 * by Yash Mate
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicySheduleDetails;

@Repository
public interface PolicySheduleDetailsRepository extends CrudRepository<PolicySheduleDetails, Integer> {

}
