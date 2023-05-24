package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 143 Design Restful API to delete the policy details from system.------> Abhijit Daware 
 */

@Entity
@Table(name = "details")
public class DeletePolicyData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String claimIDd;
	private String policyId;
	private String claimStatus;
	private String amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimIDd() {
		return claimIDd;
	}

	public void setClaimIDd(String claimIDd) {
		this.claimIDd = claimIDd;
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
