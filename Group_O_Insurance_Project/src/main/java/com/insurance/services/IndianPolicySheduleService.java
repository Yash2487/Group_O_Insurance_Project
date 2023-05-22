package com.insurance.services;

//Task 160: Design API to fetch policy schedule details from system -----> Vinayak.
import com.insurance.model.IndianPolicyShedule;

public interface IndianPolicySheduleService {

	public IndianPolicyShedule savePolicyShedule(IndianPolicyShedule indianPolicyShedule);

	public IndianPolicyShedule getPolicyShedule(Integer Id);

}
