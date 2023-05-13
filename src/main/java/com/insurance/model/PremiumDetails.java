package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 151 Build the Restful web service to
 * get all the policy premium details for specific duration
 * by-> Yash
 */
@Entity
@Table(name = "premium_details")
public class PremiumDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int PremiumId;
	private int policyId;
	private String policyHolderName;
	private String installmentPremiumAmount;
	private String policyCommencementDate;

	public PremiumDetails() {
	}

	// design parameterised constructor
	public PremiumDetails(int premiumId, int policyId, String policyHolderName, String installmentPremiumAmount,
			String policyCommencementDate) {
		PremiumId = premiumId;
		this.policyId = policyId;
		this.policyHolderName = policyHolderName;
		this.installmentPremiumAmount = installmentPremiumAmount;
		this.policyCommencementDate = policyCommencementDate;
	}

	// generate getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremiumId() {
		return PremiumId;
	}

	public void setPremiumId(int premiumId) {
		PremiumId = premiumId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
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

	@Override
	public String toString() {
		return "PremiumDetails [id=" + id + ", PremiumId=" + PremiumId + ", policyId=" + policyId
				+ ", policyHolderName=" + policyHolderName + ", installmentPremiumAmount=" + installmentPremiumAmount
				+ ", policyCommencementDate=" + policyCommencementDate + "]";
	}

}
