package com.insurance.repository;

/*Task 156 Design the API to store user with multiple premium details into database*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
