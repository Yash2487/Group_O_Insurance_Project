package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserGet;

@Repository
public interface UserGetRepository extends CrudRepository<UserGet, Integer> {

	public UserGet getUserById(int id);

}
