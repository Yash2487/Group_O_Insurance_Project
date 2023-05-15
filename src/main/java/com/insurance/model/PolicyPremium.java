package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*Task 156 Design the API to store user with multiple premium details into database*/

@Entity
@Table(name = "policy")
public class PolicyPremium {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// id, policyId, status, policyName, userId
	private int id;
	private String policyId;
	private String status;
	private String policyName;
	private int userId;

	// generate getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
