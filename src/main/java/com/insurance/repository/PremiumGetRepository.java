package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.insurance.model.PremiumGet;
/*Task  153 Design the API to get all the premium details from the database*/
public interface PremiumGetRepository extends CrudRepository<PremiumGet, Serializable>{

}
