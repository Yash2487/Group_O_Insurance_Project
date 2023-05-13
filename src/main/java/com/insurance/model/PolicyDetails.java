package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicyDetails {

	/*
	 * Task 150 Build the Restful web service to fetch user with multiple claim details --------->
	 *  Abhijit Daware
	 */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ClaimId;
	private String policyId;
	private String claimStatus;
	private String amount;

	public PolicyDetails() {
	
	}

	public PolicyDetails(String claimId, String policyId, String claimStatus, String amount) {
		
		ClaimId = claimId;
		this.policyId = policyId;
		this.claimStatus = claimStatus;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimId() {
		return ClaimId;
	}

	public void setClaimId(String claimId) {
		ClaimId = claimId;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
