package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Transection;

@Repository
public interface TransectionRepository extends CrudRepository<Transection, Integer> {

	

}
