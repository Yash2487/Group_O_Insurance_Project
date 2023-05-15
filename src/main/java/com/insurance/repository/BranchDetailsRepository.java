package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchDetails;


/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@Repository
public interface BranchDetailsRepository extends JpaRepository<BranchDetails, Integer> {

}
