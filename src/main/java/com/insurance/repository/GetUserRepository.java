package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.GetUser;
//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

@Repository
public interface GetUserRepository extends CrudRepository<GetUser, Serializable
> {

	public GetUser findById(Integer Id);
}
