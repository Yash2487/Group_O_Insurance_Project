package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 158 Design API to add policy schedule details into database
 * by Yash Mate
 */
@Entity
@Table(name = "policySheduleDetails")
public class PolicySheduleDetails {

	// Policy Name, Plan Name, User Name, Premium Amount
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policyId")
	private int id;
	@Column(name = "policyName")
	private String policyName;
	@Column(name = "planName")
	private String planName;
	@Column(name = "userName")
	private String userName;
	@Column(name = "premiumAmount")
	private String premiumAmount;

	public PolicySheduleDetails() {
		super();
	}

	// generate getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
