package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserAddUpdate;

@Repository
public interface UserAddUpdateRepository extends CrudRepository<UserAddUpdate, Integer> {

}
