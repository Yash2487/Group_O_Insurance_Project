package com.insurance.model;

import java.util.List;

//Task 157 Design API to get user with multiple premium details from database--------> Vinayak
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "newuser")
public class GetUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String surname;
	private String email;
	private String userId;

	@OneToMany(mappedBy = "premiumId")
	private List<GetPremiumDetails> getPremiumDetailsList;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;

	}

	public List<GetPremiumDetails> getGetPremiumDetailsList() {
		return getPremiumDetailsList;
	}

	public void setGetPremiumDetailsList(List<GetPremiumDetails> getPremiumDetailsList) {
		this.getPremiumDetailsList = getPremiumDetailsList;
	}

	

}
