package com.insurance.model;
//Task 149 Build the Restful web service to add user with multiple 

//claim details -----------> Vinayak 

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserDetails {

	// id, name, email

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;

	@OneToMany(mappedBy = "userId")
	private List<UserMultipleClaim> usermultipleclaimList;

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

	public List<UserMultipleClaim> getusermultipleclaimList() {
		return usermultipleclaimList;
	}

	public void setUserMultipleClaimList(List<UserMultipleClaim> usermultipleclaimList) {
		this.usermultipleclaimList = usermultipleclaimList;
	}

}
