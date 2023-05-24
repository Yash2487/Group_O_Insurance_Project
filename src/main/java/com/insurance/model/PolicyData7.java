package com.insurance.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task 141 Design the API to add Policy Details into database Done By Rohini Shinde*/
@Entity
@Table(name = "policyData7")
public class PolicyData7 {
	// policyId, policyName, policyStatus
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyId;
	private String policyName;
	private String policyStatus;
	
	//generate getter and setter method

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

}
