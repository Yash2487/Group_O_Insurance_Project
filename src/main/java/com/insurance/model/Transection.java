package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task- 173 Design API to update the transection details for each user after paying the premium 
 * ---------> Abhijit 
 */




@Entity
@Table(name = "transection")
public class Transection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String transectionId;
	private String amount;
	private String policyId;
	private String transectionStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getTransectionStatus() {
		return transectionStatus;
	}

	public void setTransectionStatus(String transectionStatus) {
		this.transectionStatus = transectionStatus;
	}

	

}
