package com.insurance.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*Task 178 Design web service to delete the settlement details by Rohini*/

@Entity
@Table(name = "settlementDelete")
public class SettlementDelete {
	// id, settlementId, status, amount
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String settlementId;
	private String status;
	private String amount;

	// generate getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
