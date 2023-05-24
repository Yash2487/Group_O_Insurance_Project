package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.DeletePolicyData;

/*
 * Task 143 Design Restful API to delete the policy details from system.------> Abhijit Daware
 */
@Repository
public interface DeletePolicyDataRepository extends JpaRepository<DeletePolicyData, Integer> {

}
