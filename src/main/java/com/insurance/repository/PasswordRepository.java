package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Password;

@Repository
public interface PasswordRepository extends CrudRepository<Password, Integer> {

}
