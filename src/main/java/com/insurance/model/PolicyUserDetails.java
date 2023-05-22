package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Task 159 Design API to update policy schedule details into database.---------
Task completed By Abhijit daware*/

@Entity
@Table(name = "policyuser")
public class PolicyUserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String PolicyNumber;
	private String DatePolicyEffectiveDate;
	private String DatePolicyExpiryDate;
	private String StringPayment_Option;
	private String DoubleTotalAmount;
	private String Status;
	private String CreatedDate;
	private String AdditionalInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}

	public String getDatePolicyEffectiveDate() {
		return DatePolicyEffectiveDate;
	}

	public void setDatePolicyEffectiveDate(String datePolicyEffectiveDate) {
		DatePolicyEffectiveDate = datePolicyEffectiveDate;
	}

	public String getDatePolicyExpiryDate() {
		return DatePolicyExpiryDate;
	}

	public void setDatePolicyExpiryDate(String datePolicyExpiryDate) {
		DatePolicyExpiryDate = datePolicyExpiryDate;
	}

	public String getStringPayment_Option() {
		return StringPayment_Option;
	}

	public void setStringPayment_Option(String stringPayment_Option) {
		StringPayment_Option = stringPayment_Option;
	}

	public String getDoubleTotalAmount() {
		return DoubleTotalAmount;
	}

	public void setDoubleTotalAmount(String doubleTotalAmount) {
		DoubleTotalAmount = doubleTotalAmount;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}

	public String getAdditionalInfo() {
		return AdditionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		AdditionalInfo = additionalInfo;
	}

}
