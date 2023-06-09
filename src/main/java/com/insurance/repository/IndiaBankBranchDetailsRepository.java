package com.insurance.repository;
//Task 164 Design API to delete branch details from system ------> Vinayak
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.IndiaBankBranchDetails;

@Repository
public interface IndiaBankBranchDetailsRepository extends CrudRepository<IndiaBankBranchDetails, Serializable> {

}
