package com.insurance.repository;

/*
 * Task 155 Design API to delete premium details from database
 * by Yash
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetails;

@Repository
public interface PremiumDetailsDeleteRepository extends CrudRepository<PremiumDetails, Serializable> {

}
