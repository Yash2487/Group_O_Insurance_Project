package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 134- Build the Restful API to add user details into database ---------> Yash
 * Task 135- Build the Restful API to update user details into database-------- > Yash
 * Task 136- Build the Restful API to get user details from database --------> Vinayak
 * Task 137- Build the Restful API to fetch all user details from database --------> Rohini
 * Task 138- Build the Restful API to delete the user details from database----------> Abhijeet
 */
@Entity
@Table(name = "user")
public class UserInformation {
	// id, name, email, city
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String city;

	// generate getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
