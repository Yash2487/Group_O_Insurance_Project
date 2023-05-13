package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premiumDetails")
public class PremiumDetails {

	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String premiumId;
	private String PolicyId;
	private String policyHolderName;
	private String installmentPremiumAmount;
	private String policyCommencementDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}

	public String getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(String policyId) {
		PolicyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getInstallmentPremiumAmount() {
		return installmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(String installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
	}

	public String getPolicyCommencementDate() {
		return policyCommencementDate;
	}

	public void setPolicyCommencementDate(String policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}

}
