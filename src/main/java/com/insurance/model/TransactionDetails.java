package com.insurance.model;
/*Task 174 Design API to get the transaction details for each user after paying the premium*/
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactionDetails")
public class TransactionDetails {
	// id, amount, TransactionStatus
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String amount;
	private String TransactionStatus;
	
	
	@OneToOne(targetEntity = UserDetails.class, cascade = CascadeType.ALL)
	private UserDetails userDetails;

	// generate getter and setter method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		TransactionStatus = transactionStatus;
	}public TransactionDetails() {
		
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
}
