package com.insurance.repository;

/*
 * Task 163: Design API to fetch branch details from system
 * @author Yash Mate
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchDetailsFetch;

@Repository
public interface BranchDetailsFetchRepository extends CrudRepository<BranchDetailsFetch, Serializable> {

	public BranchDetailsFetch findDetailsById(int id);
}
