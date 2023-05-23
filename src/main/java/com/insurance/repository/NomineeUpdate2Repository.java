package com.insurance.repository;
/*Task 168 Design service to update user with multiple nominee details into system*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.NomineeUpdate2;
@Repository
public interface NomineeUpdate2Repository extends CrudRepository<NomineeUpdate2, Integer> {

}
