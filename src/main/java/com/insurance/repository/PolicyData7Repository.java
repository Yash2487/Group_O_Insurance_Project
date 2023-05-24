package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyData7;
/*Task 141 Design the API to add Policy Details into database Done By Rohini Shinde*/

@RestController
public interface PolicyData7Repository extends JpaRepository<PolicyData7, Integer> {

}
