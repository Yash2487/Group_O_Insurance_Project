package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */



@Entity
@Table(name = "branchDetails")
public class BranchDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String branchId;
	private String Ifsc_Code;
	private String branchName;
	private String landLineNumber;
	private String address;
	private String city;
	private String pinCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getIfsc_Code() {
		return Ifsc_Code;
	}

	public void setIfsc_Code(String ifsc_Code) {
		Ifsc_Code = ifsc_Code;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLindLineNumber() {
		return landLineNumber;
	}

	public void setLindLineNumber(String lindLineNumber) {
		this.landLineNumber = lindLineNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
