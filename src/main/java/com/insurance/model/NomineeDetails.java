package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task 170 Design Service to delete user with multiple nominee details into system ---
Task Completed By Abhijit Daware*/


@Entity
@Table(name = "nomineedetails")
public class NomineeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomineeName;
	private String address;
	private String mobileNumber;

	private int userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}
}
