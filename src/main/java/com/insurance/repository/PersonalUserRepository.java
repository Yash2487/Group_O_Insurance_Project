package com.insurance.repository;
//Task- 136 Build the Restful API to get user details from database --------> Vinayak
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PersonalUser;
@Repository
public interface PersonalUserRepository extends CrudRepository<PersonalUser, Serializable> {

	public PersonalUser findById(Integer Id);

}
