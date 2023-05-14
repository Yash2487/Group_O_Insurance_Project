package com.insurance.repository;
//Task 154 Design API to update premium details into database-----------> Vinayak
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PremiumDetailsUpdate;

@Repository
public interface PremiumDetailsUpdateRepository extends CrudRepository<PremiumDetailsUpdate, Integer> {

}
