package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*Task 168 Design service to update user with multiple nominee details into system*/
@Entity
@Table(name = "userUpdate2")
public class UserUpdate2 {
	// id, name, email
	//one user has many nominee
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@OneToMany(mappedBy = "userId")
	private List<NomineeUpdate2> nomineeUpdate2List;

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
	public List<NomineeUpdate2> getNomineeUpdate2List() {
		return nomineeUpdate2List;
	}
	public void setNomineeUpdate2List(List<NomineeUpdate2> nomineeUpdate2List) {
		this.nomineeUpdate2List = nomineeUpdate2List;
	}

}
