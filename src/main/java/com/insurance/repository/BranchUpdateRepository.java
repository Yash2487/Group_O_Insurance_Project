package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchUpdate;
/*Task 162 Design the API to update branch details into system*/
@Repository
public interface BranchUpdateRepository extends CrudRepository<BranchUpdate, Integer> {

}
