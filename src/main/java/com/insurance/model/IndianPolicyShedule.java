package com.insurance.model;

//Task 160: Design API to fetch policy schedule details from system -----> Vinayak.
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IndianPolicy")
public class IndianPolicyShedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String PolicyName;
	private String PlanName;
	private String UserName;
	private float PremiumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}

	public String getPlanName() {
		return PlanName;
	}

	public void setPlanName(String planName) {
		PlanName = planName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public float getPremiumAmount() {
		return PremiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		PremiumAmount = premiumAmount;
	}

}
