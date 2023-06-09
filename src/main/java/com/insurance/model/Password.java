package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task 144- Build the Restful web services to change the user password
 * by Yash
 */
@Entity
@Table(name = "password")
public class Password {

	// id, current password, new password
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String currentPassword;
	private String newPassword;

	public Password() {
	}

	public Password(String currentPassword, String newPassword) {
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
	}

	// generate getter & setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
