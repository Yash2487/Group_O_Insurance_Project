package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.insurance.model.Policy;
/* Task 148 Build the Restful Web Service to delete claim details by Rohini Shinde */

public interface PolicyRepository extends CrudRepository<Policy, Serializable>{

}
