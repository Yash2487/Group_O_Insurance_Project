package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Password;

/*
 * Task 144- Build the Restful web services to change the user password
 * by Yash
 */
@Repository
public interface PasswordRepository extends CrudRepository<Password, Integer> {

}
