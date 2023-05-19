package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 163: Design API to fetch branch details from system
 * @author Yash Mate
 */
@Entity
@Table(name = "branchDetailsFetch")
public class BranchDetailsFetch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int branchId;
	private String IFSCCode;
	private String branchName;
	private String ladlineNumber;
	private String address;
	private String city;
	private String pincode;

	// generate setter & getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLadlineNumber() {
		return ladlineNumber;
	}

	public void setLadlineNumber(String ladlineNumber) {
		this.ladlineNumber = ladlineNumber;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
