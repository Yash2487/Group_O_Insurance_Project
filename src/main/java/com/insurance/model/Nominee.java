package com.insurance.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*Task 167 Design Service to add user with multiple nominee details into system
 * completed By Abhijit Daware
 */

@Entity
@Table(name = "nominee")
public class Nominee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomineeName;
	private String city;
	private String mobileNumber;
	private Integer userId;

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
		return city;
	}

	public void setAddress(String address) {
		this.city = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
