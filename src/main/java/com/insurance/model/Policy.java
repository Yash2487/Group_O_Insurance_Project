package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/* Task 148 Build the Restful Web Service to delete claim details by Rohini Shinde */
@Entity
@Table (name = "policy")
public class Policy {
	// id, claimId, policyId, claimStatus, claimAmount
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String claimId;
	private String policyId;
	private String claimStatus;
	private String claimAmount;
	//generate getter and setter method
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
