package com.insurance.model;

import javax.persistence.Entity;
/*Task Number= 146  Build the Restful Web Service to update the claim details
 * By Rohini Shinde
 */
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 145--Build the Restful web service to add claim details------> Vinayak
 * Task 146--Build the Restful web service to update claim details--------> Rohini
 * Task 147--Build the Restful web service to get claim details-------> Abhijit
 * Task 148--Build the Restful web service to delete claim details ----------> Rohini
 */
@Entity
@Table(name = "claimDetails")
public class ClaimDetails {
	// id, claimId, policyId, claimStatus, claimAmount
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String claimId;
	private String policyId;
	private String claimStatus;
	private String claimAmount;

	public ClaimDetails() {
		super();
	}
	// generate getter and setter method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

}