package com.insurance.model;

//Task 154 Design API to update premium details into database-----------> Vinayak
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premiumDetails")
public class PremiumDetailsUpdate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String premiumId;
	private String policyId;
	private String policyHolderName;
	private float InstallmentPremiumAmount;
	private String Policycommencementdate;

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
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public float getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(float installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}

	public String getPolicycommencementdate() {
		return Policycommencementdate;
	}

	public void setPolicycommencementdate(String policycommencementdate) {
		Policycommencementdate = policycommencementdate;
	}

}
