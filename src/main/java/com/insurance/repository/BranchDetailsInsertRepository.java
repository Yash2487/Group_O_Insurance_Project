package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchDetailsInsert;


/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@Repository
public interface BranchDetailsInsertRepository extends JpaRepository<BranchDetailsInsert, Serializable> {

}
