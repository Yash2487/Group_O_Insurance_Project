package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserData4;
/* Task 137 Build the restful API to fetch all user details from the database Done By Rohini Shinde*/
@Repository
public interface UserData4Repository extends CrudRepository<UserData4, Serializable>{

}
