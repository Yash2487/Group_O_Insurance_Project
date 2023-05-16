package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*Task 156 Design the API to store user with multiple premium details into database*/
@Entity
@Table(name = "user")
public class UserPremium {
	// id, name, email
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToMany(mappedBy = "userId")
	private List<PolicyPremium> policyList;

	// generate getter and setter method
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

	public List<PolicyPremium> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<PolicyPremium> policyList) {
		this.policyList = policyList;
	}
}
