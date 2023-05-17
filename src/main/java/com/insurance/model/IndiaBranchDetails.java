package com.insurance.model;
////Task 164 Design API to delete branch details from system ------> Vinayak
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IndianBranch")
public class IndiaBranchDetails {

	// branchId, IFSC_Code, branchName, landlineNumber, address, city, pinCode

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String IFSC_Code;
	private String branchName;
	private long landLineNumber;
	private String address;
	private int pinCode;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(String iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(long landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
