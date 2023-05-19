package com.insurance.service.impl;
/*Task 168 Design service to update user with multiple nominee details into system*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.NomineeUpdate2;
import com.insurance.repository.NomineeUpdate2Repository;
import com.insurance.services.NomineeUpdate2Service;
@Service
public class NomineeUpdate2ServiveImpl implements NomineeUpdate2Service {
	//inject the repository reference
    @Autowired
	private NomineeUpdate2Repository nomineeUpdate2Repository;
	
    
    @Override
	public NomineeUpdate2 updateNomineeUpdate(NomineeUpdate2 nomineeUpdate2) {
	NomineeUpdate2 nomineeUpdate3 =	nomineeUpdate2Repository.findById(nomineeUpdate2.getId()).orElse(null);
	  if(nomineeUpdate3!=null) {
		  nomineeUpdate2.setStatus(nomineeUpdate2.getStatus());
		  nomineeUpdate2Repository.save(nomineeUpdate2);
		  return nomineeUpdate2;
	  }
		return null;
	}
	

}
